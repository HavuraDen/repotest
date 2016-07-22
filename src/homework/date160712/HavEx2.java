package homework.date160712;

import java.util.Scanner;

/**
 * Created by Admin on 12.07.2016.
 */
public class HavEx2 {
    // Написать программку для подсчета объёма аквариума со сторонами а = 45,37см., b = 52,83см., c = 80,32см.
    // Программа должна сама запрашивать ввод сторон и выводить развернутый ответ в м. и см.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = 0.01; // для перевода см в м.
        System.out.println((a * b * c) * d + " m^3 ");
        System.out.println(a * b * c + " cm^3 ");

    }
}