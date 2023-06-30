//2) Вывести все простые числа от 1 до 1000
package HomeWorkJava1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.printf("Простые числа от 1 до %d:\n2\n", n);
        primeNumbers(n);
    }

    static void primeNumbers(int n) {
        for (int i = 3; i <= n; i += 2) {
            boolean c = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    c = false;
            }
            if (c)
                System.out.println(i);
        }
    }

}
