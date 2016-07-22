package homework.date160715;

/**
 * Created by Admin on 18.07.2016.
 */
public class HavEx1 {
    /*Дана строка:"Мне нравится Джава,
     потому кроме домашних заданий я читаю
     книги по Джава и смотрю уроки по Джава !".
     Заменить все слова "Джава" на "Java". */

    public static void main(String[] args) {

        String q = "Мне нравится Джава, потому кроме домашних заданий" +
                " я читаю книги по Джава и смотрю уроки по Джава !";
       /* System.out.println(q);//ввыводим первоначальное предложение на печать*/

        String q1 = "Джава";
        String q2 = "Java";
        String q3 = q.replace(q1, q2);//делаем замену "Джава" на "Java"
        System.out.println(q3);
    }
}
