//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWorkJava1;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        scanner.close();
        int sum = amount(n);
        int factorial = factorial(n);
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        System.out.println(n + "! = " + factorial);
}
    static int amount(int x){
        int s = 0;
        for (int i =1; i<=10; i++){
            s+=i;
        }
        return s;
    }

    static int factorial(int x){
        int f = 0;
        for (int i =1; i<=10; i++){
            f*=i;
        }
        return f;
    }

}