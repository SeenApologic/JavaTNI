import javax.swing.*;
import java.text.DecimalFormat;

public class Lab307 {
    static void main() {
        DecimalFormat frm = new DecimalFormat("###.0");
        double price, totalPrice = 0;

        while (true){
            price = Integer.parseInt(JOptionPane.showInputDialog("Input price [press 0 to stop]"));

            if (price < 0)
                price = Integer.parseInt(JOptionPane.showInputDialog("Invalid price!!!" +
                    "\nInput price [press 0 to stop]"));

            if (price == 0) break;

            totalPrice += price;
        }

        JOptionPane.showMessageDialog(null,"Total price is " + frm.format(totalPrice) + " baht.");
    }
}
