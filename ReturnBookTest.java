import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book books = new Book("Java Programming", 5);

        int confirm = JOptionPane.showConfirmDialog(null,
                "Do you want to borrow/return book?",
                "Borrow/Return Book",JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION){
            int press = Integer.parseInt(JOptionPane.showInputDialog(
                    "Press 1 to borrow book" +
                    "\nPress 2 to return book"));

            if (press == 1){
                books.borrowBook();
                System.out.println("Borrowed 1 book, available " + books.getAvailableBook() + " books.");

               if (books.getAvailableBook() == 0){
                   JOptionPane.showMessageDialog(null,
                           "No books available to borrow...","Warning Message",JOptionPane.WARNING_MESSAGE);
               }
            }
            if (press == 2){
                books.borrowBook();
                System.out.println("Return 1 book, available " + books.getAvailableBook() + " books.");
                if (books.getAvailableBook() == books.getTotalBook()){
                    JOptionPane.showMessageDialog(null,
                            "Cannot return! All books are already here.",
                            "Warning Message",JOptionPane.WARNING_MESSAGE);
                }
            }
        }else JOptionPane.showMessageDialog(null,"END PROGRAM","Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
