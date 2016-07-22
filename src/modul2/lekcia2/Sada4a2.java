package modul2.lekcia2;

import java.util.Scanner;

/**
 * Created by Admin on 12.07.2016.
 */
public class Sada4a2 {
    //прочитать с консоли символы: i,l,o,v,e,j,a,v,a.И вывести фразу: I love java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("I"); //розпичатка символа I
        String i = scanner.nextLine(); //ввод строки и сохранение в переменную
        System.out.print(" l");
        String l = scanner.nextLine();
        System.out.print("o");
        String o = scanner.nextLine();
        System.out.print("v");
        String v = scanner.nextLine();
        System.out.print("e ");
        String e = scanner.nextLine();
        System.out.print(" j");
        String j = scanner.nextLine();
        System.out.print("a");
        String a = scanner.nextLine();
        System.out.print("v");
        String v1 = scanner.nextLine();
        System.out.print("a");
        String a1 = scanner.nextLine();

        System.out.println( i + " " + l + o + v + e + " " + j + a + v + a );
    }
}
