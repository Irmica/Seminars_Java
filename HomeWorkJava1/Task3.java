//3) Реализовать простой калькулятор

package HomeWorkJava1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Введите первое число: ");
        double num1 = input.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Неправильный оператор.");
                return;
        }

    
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
