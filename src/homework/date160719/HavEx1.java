package homework.date160719;

import java.util.Scanner;

/**
 * Created by Admin on 19.07.2016.
 */
public class HavEx1 {
    /*Вывести на экран фигуру:
     **********
     *        *
     *        *
     **********
     Должны вводится 2 параметра: высота и ширина
     (int a = 4, b = 10;).  */

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 4; i < n; i++) {
                for (int j = 10; j < n ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
