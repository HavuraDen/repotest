package homework.date160712;

/**
 * Created by Admin on 12.07.2016.
 */
public class HavEx1 {
    /* Написать программку для подсчета площади прямоугольника со сторонами а = 5м., b = 5,67м.(тут Scaner не
используем). Программа должна сама выводить развернутый ответ в м., см. и км. */
    public static void main(String[] args) {
        double a = 5.0;
        double b = 5.67;
        double f = 100; // для перевода м в см.
        double d = 0.001; // для перевода м в км.
        System.out.println((a * b) + " m^2 ");
        System.out.println((a * b) * f + " cm^2 ");
        System.out.println((a * b) * d + " km^2 ");

    }
}
