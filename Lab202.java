import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();
        System.out.println();

        System.out.println("Summation = " + (number1 + number2));
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = " + (number1 * number2));
        System.out.println("Division = " + (number1 / number2));
        System.out.println("Modulus = " + (number1 % number2));

        scanner.close();
    }
}
