import javax.swing.*;

public class Lab401 {
    static void main() {
        String full_name;

        do {
            full_name = JOptionPane.showInputDialog("Enter your full name:").trim();
        }while (!full_name.contains(" "));

        int spaceIndex = full_name.indexOf(" ");

        String fName = full_name.substring(0,spaceIndex);
        String lName = full_name.substring(spaceIndex +1);

        String firstUpper = fName.substring(0,1).toUpperCase();
        String name = fName.substring(1).toLowerCase();

        fName = firstUpper + name;

        JOptionPane.showMessageDialog(null,"Welcome," + fName + " " + lName.toUpperCase());
    }
}
