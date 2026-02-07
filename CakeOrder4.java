import javax.swing.JOptionPane;

public class CakeOrder4 {

    public static void main(String[] args) {

        double pound = Double.parseDouble(
                JOptionPane.showInputDialog("How many pounds do you want?"));

        String flavor =
                JOptionPane.showInputDialog("Enter a flavor birthday cake:");

        String message =
                JOptionPane.showInputDialog("Enter a message on cake:");

        BirthdayCake cake = new BirthdayCake(message, pound, flavor, 400);

        while (true) {
            String detail =
                    "Thank you for your order!\n" +
                            cake.getFlavor() + " birthday cake (message=" + cake.getMessage() + ")\n" +
                            "Total price of Birthday Cake = " + cake.calculateTotalPrice() + "\n\n" +
                            "Confirm this order?";

            int option = JOptionPane.showConfirmDialog(
                    null,
                    detail,
                    "Select an Option",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );
            if (option == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(
                        null,
                        "Thank you for your order!\n" +
                                cake.getFlavor() + " birthday cake (message=" + cake.getMessage() + ")\n" +
                                "Total price of Birthday Cake = " + cake.calculateTotalPrice(),
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
                break;
            }
            else {
                String newMessage =
                        JOptionPane.showInputDialog("Enter a new message for changing:");
                cake.changeMessage(newMessage);
            }
        }
    }
}
