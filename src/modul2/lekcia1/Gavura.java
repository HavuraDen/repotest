package modul2.lekcia1;

/**
 * Created by Admin on 12.07.2016.
 */
public class Gavura {
    public static void main(String[] args) {

        //сравнение примитивных типов
        int age = 5;
        int lenght = 5;
        System.out.println(age == lenght) ;//true

            /*сравнение ссылочных типов*/
        String s1 ="java";
        String s2 = new String("java");
        String s3 = "java";
        System.out.println("7" == "7");//true
        System.out.println(s1 == s2);//false
        System.out.println(s1 == "java");//true
        System.out.println(s3 == "java");//true
        System.out.println(s2 == s3);//false

//Для сравнения значений ссылочных типов
// применяем метод equals
        System.out.println(s1.equals(s2));//true
    }

    }



