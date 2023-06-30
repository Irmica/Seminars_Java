package HomeWorkJava1;

import java.util.Scanner;

/**
 * Task4 Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут
 * быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
 * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
 * что его нет.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digit1 = sc.nextLine();
        // String action = sc.nextLine();
        String digit2 = sc.nextLine();
        // String equally = sc.nextLine();
        int result = sc.nextInt();
        sc.close();

        int index1 = getIndex(digit1);
        int index2 = getIndex(digit2);

        int a = digit(index1, digit1);
        int b = digit(index2, digit2);

        int firstDigit = firstDigit(a, b, result);
        if (firstDigit == -1) {
            System.out.println("Решений нет.");
        } else {
            System.out.printf("%d + %d = %d", firstDigit, result - firstDigit, result);
        }

    }

    static int getIndex(String element) {
        int index = element.indexOf("?");
        return index;
    }

    static int digit(int index, String element) {
        if (index == 0) {
            char charAtIndex1 = element.charAt(1);
            int units = Character.digit(charAtIndex1, (10));
            return units;
        } else {
            char charAtIndex2 = element.charAt(0);
            System.out.println(charAtIndex2);
            int units2 = Character.digit(charAtIndex2, (10));
            System.out.println(units2);
            return units2 * 10;
        }
    }

    static int equality(int num1, int num2, int c) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if ((num1 + i + (j * 10 + num2)) == c)
                    return num1 + i;
            }
        }
        return -1;
    }

    static int firstDigit(int d1, int d2, int d3) {
        if (d1 > d2) {
            int firstDigit = equality(d1, d2, d3);
            return firstDigit;
        } else {
            int firstDigit = equality(d2, d1, d3);
            return firstDigit;
        }
    }
}
