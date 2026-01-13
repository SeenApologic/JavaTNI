import java.util.Scanner;

public class ProductMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.name = "Pens";
        p1.price = 10.5;
        p1.quantity = 50;

        Product p2 = new Product();
        p2.name = "Notebooks";
        p2.price = 25.75;
        p2.quantity = 20;

        int press = 0;

        System.out.println("Welcome to Mini Shop");
        System.out.println("------------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");

        System.out.print("Enter a number: ");
        press = sc.nextInt();

        while (press != 1 && press != 2){
            System.out.print("Invalid number! Enter a number, again: ");
            press = sc.nextInt();
        }
        System.out.println();

        if (press == 1){
            p1.showInfo();

            System.out.println("------------------------------------------");
            System.out.print("How many Pens do you want to buy? ");
            int amount = sc.nextInt();
            p1.sell(amount);
            System.out.println("------------------------------------------");
            p1.showInfo();
        }
        if (press == 2){
            p2.showInfo();
            System.out.println("------------------------------------------");
            System.out.print("How many Notebook do you want to buy? ");
            int amount = sc.nextInt();
            p2.sell(amount);
            System.out.println("------------------------------------------");
            p2.showInfo();
        }
    }
}
