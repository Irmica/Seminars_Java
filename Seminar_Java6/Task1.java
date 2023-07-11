package Seminar_Java6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

// Task 1. Создайте метод, формирующий массив из N случайных целых чисел.
// Task 1.1 Создайте метод, в который передайте заполненный выше массив и 
// с помощью Set вычислите процент уникальных значений в данном массиве 
// и верните его в виде числа с плавающей запятой.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int n = sc.nextInt();
        System.out.println("Введите минимальное значение списка: ");
        int minValue = sc.nextInt();
        System.out.println("Введите максимальное значение списка: ");
        int maxValue = sc.nextInt();
        sc.close();

        ArrayList<Integer> newArray = createNewRandomArray(n, minValue, maxValue);
        System.out.println(newArray.toString());
        Set<Integer> mySet = noRepetitions(newArray);
        System.out.println(mySet.toString());
        double sizeSet = mySet.size();
        int sizeList = newArray.size();
        System.out.println(sizeSet / sizeList);
    }

    static ArrayList<Integer> createNewRandomArray(int n, int minValue, int maxValue) {
        ArrayList<Integer> newRandomArray = new ArrayList<>();
        int range = maxValue - minValue + 1;
        for (int i = 0; i < n; i++) {
            newRandomArray.add(((int) (Math.random() * range) + minValue));
        }
        return newRandomArray;
    }

    static Set<Integer> noRepetitions(ArrayList<Integer> newArray) {
        Set<Integer> mySet = Set.copyOf(newArray);
        return mySet;
    }
}
