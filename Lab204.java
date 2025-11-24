import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input hour  : ");
        int hour = scanner.nextInt();

        System.out.print("Input minute: ");
        int minute = scanner.nextInt();

        System.out.println("Total time is " + ((hour * 60) + minute) + " minute");
    }
}
