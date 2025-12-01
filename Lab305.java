import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum,secondNum;

        System.out.print("Enter the first  number: ");
        firstNum = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second number: ");
        secondNum = Integer.parseInt(sc.nextLine());

        for (int i = firstNum;i<=secondNum;i++){
            System.out.print(i + " ");
        }
    }
}
