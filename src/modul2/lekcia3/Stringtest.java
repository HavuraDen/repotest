package modul2.lekcia3;

import com.sun.security.auth.SolarisNumericUserPrincipal;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.SOAPPart1_1Impl;

/**
 * Created by Admin on 14.07.2016.
 */
public class Stringtest {
    public static void main(String[] args) {
        String str = "Hello Java!";

        // Подстроки
      String str2 = str.substring(0, 4); //0-начало, 5-конец
        System.out.println(str2);
        String str21 = str.substring(3, str.length());
        String str22 = str.substring(3);
        System.out.println(str21);
        System.out.println(str22);
        System.out.println(str.length());
        String str3 = "Please "
                + str.substring(0, 3)
                + "p me"
                + str.charAt(str.length()-1);
        System.out.println(str3);

        // Сцепление строк
        int num = 15;
        String strNum = str + num;
        System.out.println(strNum);

        // Сравнение
        System.out.println("Hello java!".equals(str)); //false
        System.out.println("Hello java!".equalsIgnoreCase(str)); //true
        System.out.println("Hello java!" == new String(str)); //false
        // вместо стринга "Hello java!" можна ставить переменую str.

        // Длинна строки, кодовые точкии единици
        String str4 = "Hello";
        int str4L = str4.length();
        int str4CodePoint = str4.codePointCount(0, str4.length());
        System.out.println("Длина строки: " + str4L + '\n'
                + "Длина кодовых точек: " + str4CodePoint);
        char oneStr4 = str4.charAt(2); // кодовая еденица на позиции 2
        System.out.println(str4.endsWith("lo")); // сравнивает окончание
        System.out.println(str4.indexOf("Hel"));
        System.out.println(str4.compareTo("Hello"));

        str = "怆擟昮泴";
        System.out.println("String: " + str);

        System.out.println ('\n' + "Length: " + str.length());

        System.out.println("charAt(1): " + str.charAt(1));

        System.out.println('\n' + "str.codePointAt():");
        System.out.println("0: " + str.codePointAt(0));
        System.out.println("1: " + str.codePointAt(1));
        System.out.println("2: " + str.codePointAt(2));
        System.out.println("3: " + str.codePointAt(3) + '\n');

        System.out.println("str.codePointAt(0,1): " + str.codePointCount(0, 1));
        System.out.println("str.codePointAt(0,4): " + str.codePointCount(2, 4));

        System.out.println(Character.toChars(24_582));
        System.out.println(Character.toChars(25_823));
        System.out.println(Character.toChars(26_158));
        System.out.println(Character.toChars(27_892));

        char [] chars = Character.toChars(24_582);
        char [] chars1 = Character.toChars(25_823);
        char [] stringNew = {chars[0],chars[0]};
    }
}
