package homework.date160719;

/**
 * Created by Admin on 19.07.2016.
 */
public class HavEx2 {
    /* Написать программку которая инвертирует
    введенный текст. */

    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);

        int n = sb.length() - 1;
        for (int j = (n-1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = sb.charAt(j);
            char ck =  sb.charAt(k);
            sb.setCharAt(j, ck);
            sb.setCharAt(k, cj);
        }
        System.out.println(sb.toString());
    }
}
