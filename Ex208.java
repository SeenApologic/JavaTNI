import javax.swing.*;
import java.text.DecimalFormat;

public class Ex208 {
    static void main() {
        final double priceHour = 50, priceMinute = 0.25;
        DecimalFormat frm = new DecimalFormat("##,00");
        DecimalFormat frm2 = new DecimalFormat("#,###.00");

        int hour = Integer.parseInt(JOptionPane.showInputDialog("Input start time (hour):"));
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input start time (minute):"));

        int endHour = Integer.parseInt(JOptionPane.showInputDialog("Input end time (hour):"));
        int endMinute = Integer.parseInt(JOptionPane.showInputDialog("Input end time (minute):"));

        int startTimeInMinutes = (hour * 60) + minute;
        int endTimeInMinutes = (endHour * 60) + endMinute;
        int totalParkingDurationInMinutes = endTimeInMinutes - startTimeInMinutes;
        int total_hour = totalParkingDurationInMinutes / 60;
        int total_minute = totalParkingDurationInMinutes % 60;

        JOptionPane.showMessageDialog(null,"Start parking at " + hour + ":" + frm.format(minute) +
                "\nEnd parking at " + endHour + ":" + frm.format(endMinute) +
                "\nTotal time is " + total_hour + " hour " + total_minute + " minutes" +
                "\nParking payment is " + ((total_hour * priceHour) + (total_minute * priceMinute)) + " baht.");
    }
}
