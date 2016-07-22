package modul2.lekcia4;

import java.util.Scanner;

/**
 * Created by Admin on 15.07.2016.
 */
public class Sada4a {
    /* Ввести с консоли строку "Я сейчас изучаю StringBuilder !",
     вставить после слова "изучаю" слово "методы", удалить "!",
      узнать длину фразы. После каждого этапа делать печать фразы.*/

    public static void main(String[] args) {
        String startStr = "Я сейчас изучаю StringBuilder !";
        String study = "изучаю", methods = "методы";

        StringBuilder stringBuilder = new StringBuilder(startStr);

        int indexWord = stringBuilder.indexOf(study);//показываем индекс слова "изучаю"
        int lenMethods = study.length();//узнаем длину слова "изучаю"
        int index = indexWord + lenMethods;//узнаем длину индекса после какого нужно вставить слово "методы"

        stringBuilder.insert(index, methods);//вставляем слово "методы" в индекс
        stringBuilder.insert(index, ' ');//на туже позицию вставляем пробел

        //stringBuilder.deleteCharAt(stringBuilder.length() -1);//удаляем символ "!"(один изметодов)
        stringBuilder.delete(stringBuilder.indexOf(" !"), stringBuilder.length());//удаление "пробел" и "!"

        System.out.println(stringBuilder);
    }
}
