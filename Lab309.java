import javax.swing.*;

public class Lab309 {
    public static void main(String[] args) {
        //int order = JOptionPane.showConfirmDialog(null,"Do you want to order menu?","Yakitori shop",JOptionPane.YES_NO_OPTION);

        final int chicken = 99, pork = 89, beef = 109;
        int menu;
        double price = 0, totalPrice = 0;

        while (true) {
            int order = JOptionPane.showConfirmDialog(null, "Do you want to order menu?", "Yakitori shop", JOptionPane.YES_NO_OPTION);
            if (order == 0) {
                while (true) {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Yakitori Menu" +
                            "\n[1] Chicken Wing 99 B." +
                            "\n[2] Pork with Leek 89 B." +
                            "\n[3] Beef Tongue 109 B." +
                            "\n[0] Exit and Calculate." +
                            "\nEnter menu number."));

                    switch (menu) {
                        case 1:
                            price += chicken;
                            break;
                        case 2:
                            price += pork;
                            break;
                        case 3:
                            price += beef;
                            break;
                    }
                    if (menu == 0) break;
                }
            }else break;
            JOptionPane.showMessageDialog(null, "total price is " + price + "baht.");
        }
    }
}
