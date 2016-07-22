package modul2.lekcia7;

import java.util.Arrays;

/**
 * Created by Admin on 20.07.2016.
 */
public class Sada4a2 {
    /* Заполнить массив числами от 50 до 1. Вывести
    суму и среднеарифметическое массива. */

    public static void main(String[] args) {

        System.out.print("Заполнение массива: ");
        int a[] = new int[50];
        int sum = 0;

        for (int i = 0; i < 50; i++) {
            a[i] = a.length-i;
            System.out.print(a[i] + " ");
            sum  = sum + a[i];
        }
        System.out.println();
        System.out.println("Сума массива: " + sum);
        System.out.println("Среднеарифметическое массива: " + sum/a.length);

        //вариант 2
      /*  int b = 75;
        int array[] = new int[b];
        int sum = 0;
        for (int i = b; i > 0; i--) {
            array[array.length - i] = i;
            sum += i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
        System.out.println(sum/array.length);*/
    }
}