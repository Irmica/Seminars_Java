// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Input_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        scanner.close();
    }
}
