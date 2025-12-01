import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int howMany_num = sc.nextInt();

        int number;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int evenNum = 0, oddNum = 0;

        for (int i = 1; i <= howMany_num; i++) {
            System.out.print("Enter number " + i + ": ");
            number = sc.nextInt();

            if (number % 2 == 0) evenNum++;
            else oddNum++;

            if (number < minimum) minimum = number;
            if (number > maximum) maximum = number;
        }

        System.out.println();
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
        System.out.println("Even number = " + evenNum);
        System.out.println("Odd number = " + oddNum);
    } 
}
