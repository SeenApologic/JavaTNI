import javax.swing.*;

public class BookMain2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter author's name");
        int conform = JOptionPane.showConfirmDialog(null,
                "Do you prefer to publish your nationality and brith year?");

        Author author;
        if (conform == JOptionPane.YES_OPTION){
            String nationality = JOptionPane.showInputDialog("Input author's nationality:");
            String brithYear = JOptionPane.showInputDialog("Input author's birthyear:");
            author = new Author(name,nationality,Integer.parseInt(brithYear));
        }
        else {
            author = new Author(name);
        }
        JOptionPane.showMessageDialog(null,author.showAuthorInfo());

        String title = JOptionPane.showInputDialog("Enter book title:");
        String category = JOptionPane.showInputDialog("Enter book category:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price:"));

        Book book = new Book(title,category,price,author);

        if (book.isDiscountAvailable()){
            int discount = Integer.parseInt(JOptionPane.showInputDialog("input discount %:"));
            book.setDiscountPercent(discount);
        }
        JOptionPane.showMessageDialog(null,book);
    }
}
