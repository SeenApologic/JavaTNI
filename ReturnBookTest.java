import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", 5);

        while (true) {

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to borrow/return book?",
                    "Borrow/Return Book",
                    JOptionPane.YES_NO_OPTION);

            if (confirm != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "END PROGRAM",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            String menu = JOptionPane.showInputDialog(
                    "Press 1 to Borrow book\nPress 2 to Return book");

            int press = Integer.parseInt(menu);

            if (press == 1) {

                if (book.getAvailableBook() == 0) {
                    JOptionPane.showMessageDialog(null,
                            "No books available to borrow...",
                            "Warning Message",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    book.borrowBook();
                    System.out.println("Borrowed 1 book, available "
                            + book.getAvailableBook() + " books.");
                }

            }
            else if (press == 2) {

                if (book.getAvailableBook() == book.getTotalBook()) {
                    JOptionPane.showMessageDialog(null,
                            "Cannot return! All books are already here.",
                            "Warning Message",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    book.returnBook();
                    System.out.println("Returned 1 book, available "
                            + book.getAvailableBook() + " books.");
                }

            }
            else {
                JOptionPane.showMessageDialog(null,
                        "END PROGRAM",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}
