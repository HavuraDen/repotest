package modul2.lekcia7;

import java.util.Arrays;

/**
 * Created by Admin on 20.07.2016.
 */
public class TestArejs {
    public static void main(String[] args) {
        char[] iLoveJava = {'i', 'L', 'o', 'v', 'e', 'J', 'a', 'v', 'a'};
        String str = new String(iLoveJava);
        System.out.println(str);

        String str2 = "I`m a programmer!";
        char[] ch = str2.toCharArray();
        System.out.println(Arrays.toString(ch));
    }

}