package modul2.lekcia6;


import java.util.Scanner;

/**
 * Created by Admin on 19.07.2016.
 */
public class Fortest {
    public static void main(String[] args) {
        //пример1
        Scanner sc2 = new Scanner(System.in);
        int t = sc2.nextInt();
        for (int i = 0; i < t ; i++) {
            System.out.println(i);
        }
        //пример 2
        Scanner sc3 = new Scanner(System.in);
        int r = sc3.nextInt();
        int i = 0;
        for (; i < r; ) {
            System.out.println(i);
            i++;
        }
    }
}

