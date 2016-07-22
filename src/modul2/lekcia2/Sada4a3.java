package modul2.lekcia2;

import java.util.Scanner;

/**
 * Created by Admin on 12.07.2016.
 */
public class Sada4a3 {
    // Прочитать с консоли 2-а числа и вывести результат для операторов: + - * /.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / (double) b);

    }
}

