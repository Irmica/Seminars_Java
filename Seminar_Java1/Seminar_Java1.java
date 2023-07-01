// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class Seminar_Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Cp866");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Введите имя: ");
        System.out.printf("Привет, %s!", name);
    }
}
