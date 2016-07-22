package modul2.lekcia8;

import java.util.Arrays;

/**
 * Created by Admin on 21.07.2016.
 */
public class ArreSplittest {
    public static void main(String[] args) {

        String str = "I love Java!";

        //split(символ отрезание слова, количество слов)
        String[] arrStr = str.split(" ");
        String[] arrStr2 = str.split(" ", 2);

        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrStr2));

        String str2 = "tel.: 234-56-78, tel.: 234-56-89";
        String[] arrStr3 = str2.split(":");
        System.out.println(Arrays.toString(arrStr3));
    }
}
