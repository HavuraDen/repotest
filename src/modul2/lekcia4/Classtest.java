package modul2.lekcia4;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.bcel.internal.generic.L2F;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Admin on 15.07.2016.
 */
public class Classtest {
    public static void main(String[] args) {

       //преобразоание числа в строку

        String s1 = Integer.toString(16); //"16"
        String s2 = Long.toString(888888);
        //Преобразование 222 в 16-тиричную систему
        String s3 = Integer.toString(222, 16);//de

        //преобразование строки в число:
        int i = 15;
        Integer aLong = 15;
        int a = Integer.parseInt("4455");
        int a1 = Integer.valueOf("200");
        long b = Long.parseLong("243554623453");
        int c = Integer.parseInt("de",16); //222
           }
}
