// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. 
// В случае возникновения исключения, оно должно записаться в лог-файл.

package Seminar_Java2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task5 {
    public static void main(String[] args) throws SecurityException, IOException{
        String pathProject = System.getProperty("user.dir") ;
        String pathFile1 = pathProject.concat("\\Seminar_Java2\\Seminar2-1.txt");
        String pathFile2 = pathProject.concat("\\Seminar_Java2\\Seminar2-2.txt");
        addListToFile(pathFile2, showCurrentFile(pathProject));
    }

    static String[] showCurrentFile(String dirPath) { // Задача метода вернуть список файлов в указанной директории(dirPath)
        File currentDir = new File(dirPath);
        return currentDir.list();

    }

    static void addListToFile(String filePath, String[] list) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Task5.class.getName());
        FileHandler fh = new FileHandler("Seminar2-5(log).txt");
        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);

        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);
            for (String str : list) {
                writer.write(str + "\n");
            }
            writer.close();

        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
    }

}
