import java.util.Scanner;

public class ProductMain4 {
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // สร้าง Object สินค้า 4 รายการ
        Product[] products = new Product[4];
        for (int i = 0; i < 4; i++) {
            products[i] = new Product();
        }

        // กำหนดค่าเริ่มต้นสินค้า
        products[0].setting_product("Pens", 10.0, 20);
        products[1].setting_product("Pencils", 5.0, 35);
        products[2].setting_product("Markers", 30.0, 10);
        products[3].setting_product("Highlighters", 25.0, 40);

        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("------------------------------------");
        System.out.println("Press 1 to buy Pens (items=" + products[0].stock + ")");
        System.out.println("Press 2 to buy Pencils (items=" + products[1].stock + ")");
        System.out.println("Press 3 to buy Markers (items=" + products[2].stock + ")");
        System.out.println("Press 4 to buy Highlighters (items=" + products[3].stock + ")");
        System.out.println("------------------------------------");

        int choice;
        do {
            System.out.print("Enter a number: ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid!! Enter a number: ");
            }
        } while (choice < 1 || choice > 4);

        Product selected = products[choice - 1];

        System.out.print("How many " + selected.name + " do you want to buy? ");
        int qty = sc.nextInt();

        if (qty > selected.stock) {
            System.out.println("Not enough items in stock...");
        }

        System.out.println();
        selected.showProduct();
    }
}
