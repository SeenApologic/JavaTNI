import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book books[] = new Book[3];

        for (int i = 0; i < books.length; i++){
            String title = JOptionPane.showInputDialog("Enter book title:");
            int book = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number:"));
            books[i] = new Book(title, book);
        }
        for (Book b : books)
            System.out.println(b.getTitle() + " has " + b.getTotalBook()
                    + " books, can borrow " + b.getAvailableBook() + " books.");
    }
}
