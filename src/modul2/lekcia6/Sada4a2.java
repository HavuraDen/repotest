package modul2.lekcia6;

import java.util.Scanner;

/**
 * Created by Admin on 19.07.2016.
 */
public class Sada4a2 {
    /*вывести на экран числа от 10 до 20 с помощью всех
        извесных циклов (for, while, do-while) */

    public static void main(String[] args) {

        //с помощью while и do-while
        int a = 20;
        int b = 10;

        while (a > b) {
            System.out.println("while" + a);
            a--;
        }
        do

        {
            System.out.println("do" + a);
            a--;
        } while (a > b);

       //с помощью for
        int r = 20;
        int i = 10;
        for (; i < r; ) {
            System.out.println(i);
            i++;
        }
    }
}