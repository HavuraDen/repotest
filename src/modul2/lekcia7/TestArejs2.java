package modul2.lekcia7;

import java.util.Arrays;

/**
 * Created by Admin on 20.07.2016.
 */
public class TestArejs2 {
    public static void main(String[] args) {
        int a[] = new int[20];// вместо 20 любое число
        for (int i = 0; i < 20; i++) {
            a[i] = i;
        }
        System.out.println("Элементы массива: " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
           a[i] = i + 20;
        }
        System.out.println("Длинна массива: " + a.length);
        System.out.println("Элементы масива: " + Arrays.toString(a));
    }
}
