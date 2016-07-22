package modul2.lekcia5;

/**
 * Created by Admin on 18.07.2016.
 */
public class Switchtest {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("second");
                break;
            case 3:
                System.out.println("third");
                break;
            default:
                System.out.println("otherwise");
                break;
        }
    }
}
