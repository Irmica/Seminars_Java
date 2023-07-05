package Seminar_Java3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

//1. Заполнить список n случайными числами. Отсортировать список методом sort() и вывести его на экран.

public class Task1ArrayList {
    public static void main(String[] args) {
        randomNUmbers(5, 10);
    }

    static void randomNUmbers(int size, int maxValue) {
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++)
            nums.add(rand.nextInt(maxValue));
        nums.add(rand.nextInt(maxValue));
        for (Integer num : nums)
            System.out.print(num + " ");
        System.out.println();

        nums.sort(Comparator.naturalOrder());

        Iterator<Integer> iter = nums.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
