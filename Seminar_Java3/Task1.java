package Seminar_Java3;

import java.util.Arrays;
import java.util.Scanner;

//1. Заполнить список n случайными числами. Отсортировать список методом sort() и вывести его на экран.
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int n = sc.nextInt();
        System.out.println("Введите минимальное значение списка: ");
        int minValue = sc.nextInt();
        System.out.println("Введтите максимальное значение списка: ");
        int maxValue = sc.nextInt();
        sc.close();
        int[] newArray = createNewRandomArray(n, minValue, maxValue);
        System.out.println(Arrays.toString(newArray));
        sortArray(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    static int[] createNewRandomArray(int n, int minValue, int maxValue) {
        int[] newRandomArray = new int[n];
        int range = maxValue - minValue + 1;
        for (int i = 0; i < n; i++) {
            newRandomArray[i] = (int) (Math.random() * range) + minValue;
        }
        return newRandomArray;
    }

    static void sortArray(int[] myArray) {
        Arrays.sort(myArray);
    }
}
