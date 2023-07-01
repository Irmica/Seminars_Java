import java.util.Scanner;

public class Input_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();

        // Разбиваем уравнение на две части
        String[] parts = equation.split(" + ");
        int q = Integer.parseInt(parts[0].replace("?", "0"));
        int w = Integer.parseInt(parts[1].replace("?", "0"));

        if (q + w == Integer.parseInt(equation.replace("?", ""))) {
            System.out.println("Equation solved");
        } else {
            System.out.println("No solution found");
        }

        scanner.close();
    }
}