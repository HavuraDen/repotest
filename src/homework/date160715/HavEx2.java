package homework.date160715;

/**
 * Created by Admin on 18.07.2016.
 */
public class HavEx2 {
    /* Есть текст: "Моя зарплата состовляет 11010010111100 грн.
    но я хочу повышения на 1F4 $.". Перевести в 10-ю систему
    очисления, вывести сумму з/п.  */

    public static void main(String[] args) {
        System.out.println("Моя зарплата состовляет " + Integer.parseInt("11010010111100", 2) +
                " грн. но я хочу повышения на " + Integer.valueOf("1F4", 16) + " $.");
    }
}
