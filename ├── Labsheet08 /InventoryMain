import java.util.Scanner;

public class InventoryMain {
    public static void showInfo(Inventory product){
        System.out.println("Product name : " + product.getName());
        System.out.println("Current stock: " + product.getStock());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory product1 = new Inventory("Pen",10);

        showInfo(product1);
        System.out.println("------------------------------------------");

        while (true){
            System.out.println("Press 1 add item in stock");
            System.out.println("Press 2 remove item in stock");
            System.out.print("Enter a menu: ");
            int menu = sc.nextInt();

            if (menu == 1){
                System.out.print("How many item to add in stock: ");
                product1.addStock(sc.nextInt());
                showInfo(product1);
            }
            else if (menu ==2){
                System.out.print("How many item to remove in stock: ");
                product1.removeStock(sc.nextInt());
                showInfo(product1);
            }
            else break;
        }
        System.out.println("END PROGRAM");
    }
}
