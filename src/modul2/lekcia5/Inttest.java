package modul2.lekcia5;

/**
 * Created by Admin on 18.07.2016.
 */
public class Inttest {
    public static void main(String[] args) {

        int h, d;
        h = 3;
        d = 4;

        // вариант 1
        int r = (h<d)?44:33;
        System.out.println(r);

        // вариант 2
        if (h < d) {
            r = 44;
        } else {
            r = 33;
        }
        System.out.println(r);
    }
}
