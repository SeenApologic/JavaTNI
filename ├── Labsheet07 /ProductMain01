import javax.swing.*;

public class ProductMain01 {
    public static void main(String[] args) {
        Product p1 = new Product();

        JOptionPane.showMessageDialog(null, "Welcome to Product Stock System");

        p1.name = JOptionPane.showInputDialog("Enter product name:");
        p1.price = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item:"));
        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity in stock:"));
        p1.showInfo();
        System.out.println();

        int add = JOptionPane.showConfirmDialog(
                null,
                "Do you want to add more item?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (add == JOptionPane.YES_OPTION) {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            p1.addStock(amount);
        }
        int change = JOptionPane.showConfirmDialog(
                null,
                "Do you want to change price?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (change == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per items?"));
            p1.changePrice(newPrice);
        }
        System.out.println();
        p1.showInfo();
    }
}
