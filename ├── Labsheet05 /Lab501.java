import javax.swing.*;
import java.text.DecimalFormat;

public class Lab501 {
    public static double cal_bmi(double weight, double height_cm){
        height_cm = height_cm / 100;
        return weight / (height_cm * height_cm);
    }
    public static String check_bmi(double bmi) {
        if (bmi >= 30) return "Obese";
        else if (bmi >= 25) return "Overweight";
        else if (bmi >= 18.5) return "Healthy Weight";
        else return "Underweight";
    }
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("###.00");
        while (true){
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to check your BMI?",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (choice == 0){
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.):"));
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.):"));

                double bmi = cal_bmi(weight, height);
                String result = check_bmi(bmi);

                JOptionPane.showMessageDialog(null,
                        "Your BMI = " + frm.format(bmi) +
                        "\nYour BMI result = " + result);
            }
            else {
                JOptionPane.showMessageDialog(null,"END PROGRAM!!!");
                break;
            }
        }
    }
}
