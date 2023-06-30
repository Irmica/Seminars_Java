package HomeWorkJava1;

import java.util.Scanner;

/**
 * Task3 Реализовать простой калькулятор
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Введите выражение, которое необходимо рассчитать, разделяя числа и знаки действия пробелами: ");
        int a = sc.nextInt();
        String d = sc.next();
        int b = sc.nextInt();
        sc.close();
        switch (d) {
            case "+":
                int result1 = addition(a, b);
                System.out.printf("%d %s %d = %d", a, d, b, result1);
                break;
            case "-":
                int result2 = subtraction(a, b);
                System.out.printf("%d %s %d = %d", a, d, b, result2);
                break;
            case "*":
                int result3 = multiplication(a, b);
                System.out.printf("%d %s %d = %d", a, d, b, result3);
                break;
            case "/":
                double result4 = division(a, b);
                System.out.printf("%d %s %d = %.2f", a, d, b, result4);
                break;
            default:
                System.out.println("Ошибка! Неправильный оператор.");
        }
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        double a1 = a;
        return (a1 / b);
    }
}
