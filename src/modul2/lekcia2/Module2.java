package modul2.lekcia2;

/**
 * Created by Admin on 11.07.2016.
 */
public class Module2 {
    private class SubClass {

    }
    public static void main(String[] args) {
        int a = 5;
        int  length = 5;
        System.out.println(a == length);
        System.out.println(a);
        int x = a++;
        System.out.println(a);
        int y = ++a;
        System.out.println(a);
        System.out.println(x);
        System.out.print(y);
    }
}
