import javax.swing.*;

public class BorrowBookTest {
    public static void main(String[] args) {
        Book books = new Book("C#  programming", 5);

        int confirm = JOptionPane.showConfirmDialog(null,
                "Do you want to borrow books?",
                "Borrow Book", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            if (books.getAvailableBook() != 0){
                books.borrowBook();
                System.out.println("Borrowed 1 book, available " + books.getAvailableBook() + " books.");
            }
            if (books.getAvailableBook() == 0){
                JOptionPane.showMessageDialog(null,
                        "No books available to borrow...","Warning Message",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        else JOptionPane.showMessageDialog(null,
                "END PROGRAM","Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
