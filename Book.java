public class Book {
    private String title;
    private int totalBook,availableBook;

    Book(String title, int totalBook){
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }
    Book(String title){
        this(title, 0);
        this.availableBook = 0;
    }
    Book(){
        this("",0);
        this.availableBook = 0;
    }
    public String getTitle(){
        return this.title;
    }
    public int getTotalBook(){
        return this.totalBook;
    }
    public int getAvailableBook(){
        return availableBook;
    }
    public void borrowBook(){
        if (availableBook > 0)
            availableBook--;
    }
    public void returnBook(){
        if (availableBook < totalBook)
            availableBook++;
    }
}
