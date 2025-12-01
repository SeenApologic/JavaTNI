import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    static void main() {
        DecimalFormat frm = new DecimalFormat("###.00");

        double weight, height;

        weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.):"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.):"));

        double heightRate = height / 100;
        double bmi = weight / (heightRate * heightRate);

        String result;

        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25) {
            result = "Healthy Weight";
        } else if (bmi < 30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        JOptionPane.showMessageDialog(null,
                "Your BMI is " + frm.format(bmi) +
                        "\nBMI result is " + result);
    }
}
