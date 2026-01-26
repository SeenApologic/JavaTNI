public class Book {
    private String title;
    private  String category;
    private  double price;
    private int discountPercent;
    private Author author;

    Book(String title, String category, double price,Author author){
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = author;
        this.discountPercent = 0;
    }
    Book(){
        this("","",0.0,null);
    }
    public Author getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public void setDiscountPercent(int percent){
        this.discountPercent = percent;
    }
    public int getDiscountPercent() {
        return discountPercent;
    }
    public boolean isDiscountAvailable(){
        return this.price > 500;
    }
    public double calculateDiscountPrice(){
        return this.price - (this.price * getDiscountPercent() / 100.0);
    }
    public String toString(){
        return "Title   : " + this.title +
                "\nCategory: " + this.category +
                "\nPrice   : " + this.price + (isDiscountAvailable() ? "(" + calculateDiscountPrice() + ")" : "") +
                "\nAuthor  : " + this.author.showAuthorInfo();
    }
}
