package modul2.lekcia6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 19.07.2016.
 */
public class BuffReadStopFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       // String word = br.readLine();
        String number = br.readLine();
        int num = Integer.parseInt(number);
        String number2 = br.readLine();
        int num2 = Integer.parseInt(number2);

        stopFor:
        while (num < 10) {
            System.out.println("num внутри while: "+ num);
            for (num = num; num < 9; num++) {
                System.out.println("num внутри for: " + num + '\n'
                        + "num2 внутри for: " + num2);
                num2++;
                if (num2 >= 5) {
                    break stopFor;
                }
                num2++;
            }
        }
        System.out.println("После циклов num = " + num + " и num2 = " + num2);

    }
}
