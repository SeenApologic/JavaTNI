public class BookMain3 {
    public static Book[] book_initial() {
        Book[] books = new Book[] {
                new Book("Java Programming", "Computers", 325.75, new Author("Malee")),
                new Book("English 101", "Languages", 200, new Author("Tipco")),
                new Book("Japanese 101", "Languages", 210, new Author("Tipco")),
                new Book("R Programming", "Computers", 400, new Author("Malee"))
        };
        return books;
    }
    public static void main(String[] args) {

    }
}
