package modul2.lekcia6;

import java.util.Scanner;

/**
 * Created by Admin on 19.07.2016.
 */
public class Cykltest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
