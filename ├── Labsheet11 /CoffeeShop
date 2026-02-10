package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int espressoCount = 0;
        int frappuccinoCount = 0;
        double total = 0;

        while (true) {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                Espresso e = orderEspresso();
                espressoCount++;
                total += e.calculateFinalPrice();

                System.out.println(e);
                //System.out.println("Total Price = " + e.calculateFinalPrice() + " Baht");

            } else if (option == 2) {
                Frappuccino f = orderFrappuccino();
                frappuccinoCount++;
                total += f.calculateFinalPrice();

                System.out.println(f);
                System.out.println("Total Price = " + f.calculateFinalPrice() + " Baht");
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            String more = sc.nextLine();

            if (!more.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nYou ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + total);
    }
    public static Espresso orderEspresso() {

        System.out.print("Enter a size: ");
        String size = sc.nextLine();

        Espresso e = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int addShot = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < addShot; i++) {
                e.addShot();
            }
        }
        return e;
    }
    public static Frappuccino orderFrappuccino() {

        System.out.print("Enter size: ");
        String size = sc.nextLine();

        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String ans = sc.nextLine();

        boolean whipped = ans.equalsIgnoreCase("y");

        return new Frappuccino(size, whipped);
    }
}
