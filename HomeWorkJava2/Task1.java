package HomeWorkJava2;
// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида

// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        String dirPath = System.getProperty("user.dir") + ("\\TestDir"); // путь к тестовой директории
        System.out.println(dirPath);
        String[] catalog = getFileList(dirPath);
        definitionOfAnExtension(catalog);
    }

    static String[] getFileList(String dirPath) {
        File currentList = new File(dirPath);
        return currentList.list();
    }

    static void definitionOfAnExtension(String[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            int index = fileList[i].indexOf(".");
            String result = i + 1 + ") Расширение файла: " + fileList[i].substring(index);
            System.out.println(result);
        }
    }

}
