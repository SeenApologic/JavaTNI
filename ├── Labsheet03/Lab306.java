import javax.swing.*;

public class Lab306 {
    static void main() {
        int integerNumber,sum = 0;

        integerNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer number:"));

        for (int i = 1;i <= integerNumber;i++) sum += i;

        JOptionPane.showMessageDialog(null,"Summation of 1 to " + integerNumber + " is " + sum);
    }
}
