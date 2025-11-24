import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));

        JOptionPane.showMessageDialog(null,minute + " minutes is " + (minute / 60) + "  hour "
                + (minute % 60) + " minute");
    }
}
