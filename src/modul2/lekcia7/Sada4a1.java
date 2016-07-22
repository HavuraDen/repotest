package modul2.lekcia7;

/**
 * Created by Admin on 20.07.2016.
 */
 public class Sada4a1 {
    /*Создать массив чисел от 0 до 20,вывести все четные числа,
    не четные и весь массив(используя for each)/*/

    public static void main(String[] args) {
       int a [] = new int[20];
       for (int i = 0; i < 20; i++){
           a[i] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i < a.length; i++) {
            if(a[i]%2 == 0){ //четные
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            if(a[i]%2 != 0) { //не четные
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) { //масив через for
            System.out.print(a[i] + " ");
        }
    }
}
