package HomeWorkJava1;

public class Task2 {
    public class PrimeNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Простые числа от 1 до 1000:");

        for (i = 2; i <= 1000; i++) {
            isPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
}
