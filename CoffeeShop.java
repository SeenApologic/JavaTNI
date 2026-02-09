package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappucino");

            System.out.print("Enter a option: ");
            int option = sc.nextInt();

            if (option ==1 ) {

            }
            if (option ==2 ){

            }

            System.out.print("Do you want to order more [y/Y]? ");
            String more = sc.next();
            if (more.equalsIgnoreCase("y")) break;
        }
    }
    public Espresso orderEspresso(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = sc.next();

    }
    public Frappuccino orderFrappucino(){

    }

}
