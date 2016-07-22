package modul2.lekcia2;

import java.util.Scanner;

/**
 * Created by Admin on 12.07.2016.
 */
public class Scannertest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = scanner.nextLine();
        System.out.println("You printed:"+s);

        System.out.print("Enter integer:");
        int i = scanner.nextInt(), i2 = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        System.out.println("You printed:"+i);
    }
}

