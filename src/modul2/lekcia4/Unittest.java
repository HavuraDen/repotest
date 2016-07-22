package modul2.lekcia4;

/**
 * Created by Admin on 15.07.2016.
 */
public class Unittest {
    public static void main(String[] args) {
        String s = "asasasasasasdfgs";
        String s1 = s.replace("as", "");
        System.out.println(s1);

        String q = "asasasasasasdfgs";
        String q1 = "as";
        String q2 = "12";
        String q3 = s.replace(q1, q2);//замена строки
        System.out.println(q3);

        char c = 'a', c1 = '!';
        System.out.println(s.replace(c, c1));//амена символа
    }
}
