package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        String customer_name = JOptionPane.showInputDialog("Enter customer's name:");
        double totalPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter customer's bill:"));

        int isMember = JOptionPane.showConfirmDialog(null,
                "Do you have a member card?",
                "Member",JOptionPane.YES_NO_OPTION);
        if (isMember == JOptionPane.YES_OPTION){
            String member_level = JOptionPane.showInputDialog("Enter a member level [Gold/Premium]");

            Member bill = new Member(customer_name,totalPrice,member_level);
            JOptionPane.showMessageDialog(null,bill);
        }else {
            Regular bill = new Regular(customer_name,totalPrice);
            JOptionPane.showMessageDialog(null,bill);
        }
    }
}
