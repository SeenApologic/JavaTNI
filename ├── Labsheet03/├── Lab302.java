import javax.swing.*;
import java.text.DecimalFormat;

public class Lab302 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#.0");

        String name = JOptionPane.showInputDialog("Enter your name: ");
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.): "));

        int gender = JOptionPane.showConfirmDialog(null,"Are your biological gender is male?","Gender",JOptionPane.YES_NO_OPTION);

        if (gender == 0) JOptionPane.showMessageDialog(null,"Hello,Mr." + name +
                "\nif your height is " + frm.format(height) + " cm." + "\nYour weigh should be " + frm.format(height - 100) + " kg.");

        else {
            gender = JOptionPane.showConfirmDialog(null,"Are your biological gender is female?","Gender",JOptionPane.YES_NO_OPTION);

            if (gender == 0) JOptionPane.showMessageDialog(null,"Hello,Ms." + name +
                    "\nif your height is " + frm.format(height) + " cm." + "\nYour weigh should be " + frm.format(height - 110) + " kg.");
            else JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and height.");
        }
    }
}
