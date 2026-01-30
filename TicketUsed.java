import javax.swing.JOptionPane;

public class TicketUsed {

    public static String show_movie_list(Ticket... tickets) {
        String result = "";
        for (Ticket t : tickets) {
            result += t.getTicket_id() + ": "
                    + t.getMovie().toString() + "\n";
        }
        return result;
    }

    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[]{
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("A Walk to Remember", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int confirm;

        do {
            confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use a ticket?",
                    "Ticket",JOptionPane.YES_NO_OPTION
            );

            if (confirm != JOptionPane.YES_OPTION) break;

            String ticket_id = JOptionPane.showInputDialog(
                    show_movie_list(tickets)
                            + "\nEnter a ticket id for booking:"
            );

            Ticket selectedTicket = null;
            for (Ticket t : tickets) {
                if (t.getTicket_id().equals(ticket_id)) {
                    selectedTicket = t;
                    break;
                }
            }

            if (selectedTicket == null) {
                JOptionPane.showMessageDialog(null, "Ticket not found");
                continue;
            }

            String menu = JOptionPane.showInputDialog(
                    selectedTicket.getTicket_id() + ": "
                            + selectedTicket.getMovie().toString()
                            + "\n\nPress 1 to book a ticket"
                            + "\nPress 2 to use a ticket"
                            + "\nPress 3 to see a ticket status"
                            + "\n\nEnter a menu:"
            );

            int choice = Integer.parseInt(menu);

            if (choice == 1) {
                JOptionPane.showMessageDialog(
                        null,
                        selectedTicket.bookTicket()
                                + "\n------------------\n"
                                + selectedTicket.toString()
                );
            } else if (choice == 2) {
                JOptionPane.showMessageDialog(
                        null,
                        selectedTicket.useTicket()
                                + "\n------------------\n"
                                + selectedTicket.toString()
                );
            } else if (choice == 3) {
                JOptionPane.showMessageDialog(
                        null,
                        selectedTicket.toString()
                );
            }

            confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use other tickets?",
                    "Ticket",JOptionPane.YES_NO_OPTION
            );

        } while (confirm == JOptionPane.YES_OPTION);
    }
}
