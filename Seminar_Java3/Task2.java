package Seminar_Java3;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int n = sc.nextInt();
        sc.close();
        String[] planets = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        String[] morePlanets = randomStringArray(planets, n);
        System.out.println(Arrays.toString(morePlanets));
    }

    static String[] randomStringArray(String[] sourceArray, int n) {
        String[] myNewArray = new String[n];
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * (sourceArray.length));
            myNewArray[i] = sourceArray[randomIndex];
        }
        return myNewArray;
    }
}
