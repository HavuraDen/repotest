package modul2.lekcia5;

/**
 * Created by Admin on 18.07.2016.
 */
public class Iftest {
    public static void main(String[] args) {

        //пример1
        int a = 2;

        if (a == 1) {
            System.out.println('1');
        } else
            if (a == 2) {
                System.out.println('2');
            } else if (a == 3) {
                System.out.println('3');
            } else
                System.out.println("Хм ...");

//пример 2
        if (a < 3 && a == 1) {
            System.out.println("a < 3 && a == 1");
        } else  if (a == 2 || a > 5) {
            System.out.println("a == 2 || a > 5");
        } else {
            System.out.println("I dont now");
        }

    }
}


