public class Product {
    public String name;
    public double price;
    public int quantity;

    public void addStock(int amount){
        if (amount > 0){
            quantity += amount;
            System.out.println("Added " + amount + " items to stock");
        }
    }
    public void sell(int amount){
        if (amount <= quantity){
            quantity -= amount;
            System.out.println("Sole " + amount + " items");
        }
        else
            System.out.println("Not enough items in stock...");
    }
    public void changePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            System.out.println("Change price to " + newPrice + " baht");
        }
    }
    public double stockValue(){
        return price * quantity;
    }
    public void showInfo(){
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price + " Baht/Item");
        System.out.println("Stock : " + quantity + " Items");
        System.out.println("Stock value : " + stockValue() + " Baht");
    }
}
