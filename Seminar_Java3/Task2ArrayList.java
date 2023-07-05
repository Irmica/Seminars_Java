package Seminar_Java3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
public class Task2ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int n = sc.nextInt();
        sc.close();

        ArrayList<String> planet = new ArrayList<>() {
            {
                add("Меркурий");
                add("Венера");
                add("Земля");
                add("Марс");
                add("Юпитер");
                add("Сатурн");
                add("Уран");
                add("Нептун");
            }
        };
        randomStringArray(planet, n);
    }

    static void randomStringArray(ArrayList<String> sourceArray, int n) {
        Random rand = new Random();
        ArrayList<String> myNewArray = new ArrayList<>(n);
        int[] counts = new int[sourceArray.size()];
        for (int i = 0; i < n; i++) {
            int randomIndex = rand.nextInt(sourceArray.size());
            String temp = sourceArray.get(randomIndex);
            myNewArray.add(temp);
            counts[randomIndex]++;
        }
        System.out.println(myNewArray.toString());
        for (int j = 0; j < counts.length; j++) {
            String tempPlanet = sourceArray.get(j);
            int tempCount = counts[j];
            System.out.printf("%s встречается %d раз.\n", tempPlanet, tempCount);
        }

    }
}
