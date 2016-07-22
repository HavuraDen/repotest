package homework.date160714;

import java.util.Scanner;

/**
 * Created by Admin on 14.07.2016.
 */
public class HavEx1 {
    /*Создаем 3 строки (консольно – через Scaner), соединяем 2-е из них, сравниваем с 3-й, разъединяем
строки в первоначальном состояние. Считаем символы, во всех строках. После каждой операции
результат выводим на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String q1, q2, q3;
        q1 = scanner.nextLine();
        q2 = scanner.nextLine();
        q3 = scanner.nextLine();
        String strNum = q1 + q2;
        System.out.println(strNum);
        //создаем 3 строки и соединяем 2-е из aних

       System.out.println(strNum.equals(q3)); //false
        //сравниваем 1,2 с 3
        strNum = q1 + "|" + q2;
        String[] strSplit = strNum.split("\\|");
        System.out.println(strSplit[0]);
        System.out.println(strSplit[1]);
        System.out.println(q3);
        //разъединяем строки в первоначальное состояние

        int q4 = q1.length();
        int q5 = q2.length();
        int q6 = q3.length();
        System.out.println(q4);
        System.out.println(q5);
        System.out.println(q6);

    }
}
