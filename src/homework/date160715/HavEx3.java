package homework.date160715;

/**
 * Created by Admin on 18.07.2016.
 */
public class HavEx3 {
    /*Текст: "Кто тО наПИсАл, а мНе ИспраВЛЯть !", перевести
    его к виду "Кто то написал, а Мне исправлять !".  */

    public static void main(String[] args) {
String q = "Кто тО наПИсАл, а мНе ИспраВЛЯть !";

        String q1 = q.toLowerCase();
        String q2 = q1.replace("кто", "Кто");
        String q3 = q2.replace("мне", "Мне");

        System.out.println(q);
        System.out.println(q3);

    }
}
