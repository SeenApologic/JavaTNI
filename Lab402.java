import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String  id = "", result ="";

        do {
            id = JOptionPane.showInputDialog("Enter students-id:");
        }while (id.length() < 10);

        switch (id.substring(2,5)){
            case "131": result = "Information Technology (IT)"; break;
            case "132": result = "Multimedia Technology (MT)"; break;
            case "133": result = "Digital Business Information Technology (BI)"; break;
            case "134": result = "Digital Technology in Mass Communication (DC)"; break;
            case "135": result = "Data Science and Data Analytics (DS)"; break;
            default:  result = "Cannot found major";
        }
        JOptionPane.showMessageDialog(null,"Students ID:" + id + "\nMajor:" + result);
    }
}
