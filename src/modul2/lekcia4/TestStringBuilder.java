package modul2.lekcia4;

/**
 * Created by Admin on 15.07.2016.
 */
import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.util.Scanner;

public class TestStringBuilder {
    public static void main(String[] args) {

        char ch = 'w';

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb);

        sb.append("А этот текст добавили в StringBuilder");
        String goodStr = sb.toString();
        System.out.println(goodStr);

        int goodStrLength = goodStr.length();
        System.out.println("Длина строки: " + goodStrLength);
        sb.insert(10, "(етод .insert)");
        System.out.println(sb);

        System.out.println(sb);
        System.out.println(sb.delete(3, 5));

        sb.setCharAt(0, 'x');
        sb.setCharAt(1, ch);
        System.out.println(sb.toString());

    }
}
