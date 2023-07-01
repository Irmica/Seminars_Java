
package Seminar_Java2;

import java.io.File;
import java.io.FileWriter;

public class Task4 {

    public static void main(String[] args) {
        // Напишите метод, который составит строку, состоящую из iters повторений слова
        // word и метод,
        // который запишет эту строку в простой текстовый файл, обработайте исключения.
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\Seminar2_Task4.txt");
        addingToFile(pathFile, longStringCreator("Hello!", 5));
    }

    static String longStringCreator(String word, int iters) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < iters; i++) {
            newStr.append(word);
        }
        return newStr.toString() + "\n";
    }

    static void addingToFile(String filePath, String text) {
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile, true);

            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}