package modul2.lekcia5;

import java.util.Scanner;

/**
 * Created by Admin on 18.07.2016.
 */
public class Sada4a1 {
    //Написать програмку которая будет запрашивать 3/4/5 числа(ел)и показывать минимальное из них//

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("число a = ");
        int a = scanner.nextInt();
        System.out.println("число b = ");
        int b = scanner.nextInt();
        System.out.println("число c = ");
        int c = scanner.nextInt();
        System.out.println("число d = ");
        int d = scanner.nextInt();
        System.out.println("число f = ");
        int f = scanner.nextInt();

       if (a <= b && a <= c ||a <= d && a <= f) {
           System.out.println("минимальное число " + a );
       } else if (b <= a && b <= c ||b <= d && b <= f) {
           System.out.println("минимальное число " + b );
       } else if (c <= d && c <= f) {
           System.out.println("минимальное число " + c );
       } else if (d <= f) {
            System.out.println("минимальное число " + d );
        } else  {
           System.out.println("минимальное число " + f);
       }

    }
}
