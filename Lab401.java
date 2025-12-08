import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {

        String full_name = "";

        while (true){
            full_name = JOptionPane.showInputDialog("Enter your full name:");
            full_name = full_name.trim();
        }
    }
}
