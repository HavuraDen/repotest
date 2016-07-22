package modul2.lekcia6;

/**
 * Created by Admin on 19.07.2016.
 */
public class Sada4a3 {
    /*вивести на экран все числа от 1 до 100,
    которые делятся на 3 без остатка. */
    public static void main(String[] args) {
        for (int i = 3; i < 100; i+= 3){
            System.out.println(i);
        }
        //есть еще такой вариант:
        for (int i = 1; i < 100; i++){  // для быстрого набора используем сочетание fori
            if(i % 3 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
