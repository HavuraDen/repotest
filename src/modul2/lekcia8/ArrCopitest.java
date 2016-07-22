package modul2.lekcia8;

import java.util.Arrays;

/**
 * Created by Admin on 21.07.2016.
 */
public class ArrCopitest {

    public static void main(String[] args) {

        //копирование в ручную
        int [] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i*2;
        }
        final int[] arr2 = new int[10];

      //  arr2 = arr1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        arr1[0] = 777;
        arr2[0]++;
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        int [] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3 [i] = i*2;
        }
        int[] arr4 = new int[14];
        //копируем arr3.length элементов масива arr3, с позиции 0
        //в масив arr4 начиная с позиции 2
        System.arraycopy(arr3, 0, arr4, 2, arr3.length);
        System.out.println("arr4: " + Arrays.toString(arr4));

        //Arrays.copyOf(копируем масив, длина нового массива)
        //копирование массива с увиличением длинны нового массива
        int[] arr5 = Arrays.copyOf(arr4, arr4.length *2);
        System.out.println("arr5: " + Arrays.toString(arr5));

        arr5 = Arrays.copyOf(arr5, (int) (arr5.length * 1.5));
        System.out.println("arr5: " + Arrays.toString(arr5));

        //Arrays.copyOfRange(копируем массив, с элемента, до элемента)
        //копирование массива с увиличением длиннынового массива
        int[] arr6 = Arrays.copyOfRange(arr4, 0, arr4.length * 2);
        System.out.println("arr6: " + Arrays.toString(arr5));

        //заполнение массива
        int[] arr7 = new int[7];
        Arrays.fill(arr7, 3+34);
        System.out.println("arr7: " + Arrays.toString(arr7));

        //быстрая сортировка
        int arr8 [] = {5, 1, 9, 6, 9, 2, 4};
        String arr8s [] = {"1", "q", "!", "ф"};
        Arrays.sort(arr8, 1, 5);;
        System.out.println(Arrays.toString(arr8));
        Arrays.sort(arr8);
        System.out.println(Arrays.toString(arr8));

        //сравнение массивов
        //не работает для масивов
        System.out.println(arr1.equals(arr2));
        //а это работает!
        boolean barr = Arrays.equals(arr1, arr2);
        System.out.println(barr);
    }
}
