package modul2.lekcia7;

import java.util.Arrays;

/**
 * Created by Admin on 20.07.2016.
 */
public class TestForEach {
    public static void main(String[] args) {
        int TestForEach[] = {2, 3, 7, 1, 9, 2, 0};

        for (int i : TestForEach) {
            System.out.println(i + " ");
        }
        //пример для чего используем
        String name[] = {"Василий", "Иван", "Петр"};
        String lastName[] = {"Петров", "Иванов", "Васильев"};
        int i = 0;
        for (String s1 : name) {
            name[i] = s1 + " " + lastName[i];
            i++;
        }
        System.out.print(Arrays.toString(name));
    }
}
