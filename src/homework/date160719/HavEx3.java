package homework.date160719;

/**
 * Created by Admin on 19.07.2016.
 */
public class HavEx3 {
    /* Написать программку которая из текста "сиДОРенко ИваН
    сТЕпановИЧ" сделает текст "Сидоренко Иван Степанович" и
    выдаст инициалы: "С. И. С.".  */

    public static void main(String[] args) {

        String s = "сиДОРенко ИваН сТЕпановИЧ";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String part: s.toLowerCase().split(" ")) { //привели к нижнему регистру и розбили на подстроки
            char ch = Character.toUpperCase(part.charAt(0));//привели к верхнему регистру начало каждого слово
            sb.append(ch + part.substring(1) + " ");
            sb2.append(ch + ". ");
        }

        System.out.println(sb.toString().trim());
        System.out.println(sb2.toString().trim());
    }
}
