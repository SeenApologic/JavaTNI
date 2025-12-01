import javax.swing.*;
import java.text.DecimalFormat;

public class Lab207 {
    public static void main(String[] args) {
        final double hourWage = 7.50, taxRate = 0.15;
        DecimalFormat frm = new DecimalFormat("#,##0.00");


        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");

        String employeeName = JOptionPane.showInputDialog("Enter employee name:");
        int totalHourWork = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee:"));

        double totalPrice = totalHourWork * hourWage, totalPriceAfterTax = totalPrice - (totalPrice * taxRate);

        JOptionPane.showMessageDialog(null,"Employee name : " + employeeName
                + "\nHour worked : " + totalHourWork + "\nHourly wage : $" + frm.format(hourWage)
                + "\nGross earnings : " + frm.format(totalPrice) + "\nTax rate : " + taxRate
                + "\nTax : " + frm.format(totalPrice * taxRate) + "\nNet earning : $" + frm.format(totalPriceAfterTax));
    }
}
