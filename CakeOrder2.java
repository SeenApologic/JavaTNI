public static String selectFlavor() {
    Scanner sc = new Scanner(System.in);
    int choice;
    String flavor = "";

    System.out.println();
    System.out.println("Press 1 for Chocolate");
    System.out.println("Press 2 for Vanilla");
    System.out.println("Press 3 for Strawberry");
    System.out.println("Press 4 for Lemon");
    System.out.println("Press 5 for Red Velvet");

    System.out.print("Enter a flavor number: ");
    choice = sc.nextInt();

    while (true) {

        if (choice == 1) {
            flavor = "Chocolate";
            break;
        }
        else if (choice == 2) {
            flavor = "Vanilla";
            break;
        }
        else if (choice == 3) {
            flavor = "Strawberry";
            break;
        }
        else if (choice == 4) {
            flavor = "Lemon";
            break;
        }
        else if (choice == 5) {
            flavor = "Red Velvet";
            break;
        }
        else {
            System.out.print("Enter a flavor number: ");
            choice = sc.nextInt();
        }
    }

    return flavor;
}


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Press 1 to order Birthday Cake");
    System.out.println("Press 2 to order Cup Cake");
    System.out.println("Press 3 to order Brownie");
    System.out.print("Enter an option: ");

    int option = sc.nextInt();

    if (option == 1) {

        String flavor = selectFlavor();

        System.out.println();

        System.out.print("Enter a message: ");
        String message = sc.next();

        System.out.print("How many pounds: ");
        double pound = sc.nextDouble();

        System.out.println();

        BirthdayCake order =
                new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order);

    }
    else if (option == 2) {

        String flavor = selectFlavor();

        System.out.println();
        System.out.print("How many pieces: ");
        int piece = sc.nextInt();

        System.out.println();

        CupCake order =
                new CupCake(piece, flavor, 70);

        System.out.println(order);

    }
    else if (option == 3) {

        String flavor = selectFlavor();

        System.out.println();
        System.out.print("How many kilograms: ");
        double kilo = sc.nextDouble();

        System.out.println();

        Brownie order =
                new Brownie(kilo, flavor, 150);

        System.out.println(order);
    }
    else {
        System.out.println("Wrong option!! Try again!!");
    }
}
