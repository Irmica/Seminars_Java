package HomeWorkJava2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task2 {

    public static void main(String[] args) throws SecurityException, IOException {
        int[] numbers = { 2, 4, 6, 32, 1, 8, 5, 4, 9 };
        System.out.println(Arrays.toString(bubbleSorting(numbers)));
    }

    static int[] bubbleSorting(int[] listForSort) throws SecurityException, IOException {
        String pathFile = System.getProperty("user.dir") + "\\HomeWorkJava2\\Task2.txt";
        for (int j = listForSort.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (listForSort[i] > listForSort[i + 1]) {
                    int temp = listForSort[i];
                    listForSort[i] = listForSort[i + 1];
                    listForSort[i + 1] = temp;
                }
                addListToFile(listForSort, pathFile);
            }
        }
        return listForSort;
    }

    static void addListToFile(int[] list, String pathToLogFile) throws SecurityException, IOException {
        try {
            File myFile = new File(pathToLogFile);
            FileWriter writer = new FileWriter(myFile, true);

            writer.write(Arrays.toString(list) + "\n");

            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}