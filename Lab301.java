import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String evenOdd,textNumInt = "";

        System.out.print("Enter an integer number: ");
        number = Integer.parseInt(sc.nextLine());

        evenOdd = number % 2 ==0? "Even " : "Odd ";

        if (number > 0) textNumInt = "Positive";
        else if (number < 0) textNumInt ="Negative";
        else textNumInt = "Zero";

        if (number == 0) System.out.println("This is " + textNumInt + " number.");
        else System.out.println("This number is " + evenOdd + "and " + textNumInt + " number.");
    }
}
