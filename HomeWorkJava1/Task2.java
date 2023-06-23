package HomeWorkJava1;

public class Task2 {

    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Prime numbers from 1 to 1000:");

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
