import javax.swing.*;

public class Lab105 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Summation number = " + (5+2) +
                "\nSubtraction number = " + (2 - 5) +
                 "\nMultiplication number = " + (2 * 5) +
                "\nDivision number = " + (2 / 5.0)+
                "\nModulus number = " + (2%5),
                "Arithmetic Operators",
                JOptionPane.WARNING_MESSAGE);
    }
}
