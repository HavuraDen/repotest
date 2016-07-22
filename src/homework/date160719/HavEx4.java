package homework.date160719;

import java.util.Scanner;

/**
 * Created by Admin on 19.07.2016.
 */
public class HavEx4 {
    // Вывести таблицу Пифагора 10*10

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//сканер ставим чтобы ишел запрос(можна без него)
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {  //n-любое значение
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
