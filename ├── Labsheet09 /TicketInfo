import javax.swing.JOptionPane;

public class TicketInfo {
    public static String select_showtime(Movie movie) {

        String input = JOptionPane.showInputDialog(
                "Titanic (PG-13, 120 mins)"
                        + "\nPress 1 to select show time = 13:00"
                        + "\nPress 2 to select show time = 14:30"
                        + "\nPress 3 to select show time = 15:00"
                        + "\nEnter a number:"
        );

        int choice = Integer.parseInt(input);

        if (choice == 1) {
            return "13:00";
        } else if (choice == 2) {
            return "14:30";
        } else if (choice == 3) {
            return "15:00";
        } else {
            return "Error time";
        }
    }
    public static String select_seat_number() {

        String row = JOptionPane.showInputDialog(
                "Enter seat row (A-G)"
        );

        String number = JOptionPane.showInputDialog(
                "Enter seat number (1-12)"
        );

        row = row.toUpperCase();

        return row + number;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        String show_time = select_showtime(movie);

        String seat_number = select_seat_number();

        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240);

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}
