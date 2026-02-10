public class Inventory {
    private String name;
    private int stock;

    Inventory(String name,int stock){
        this.name = name;
        this.stock = stock;
    }
    Inventory(String name){
        this(name, 0);
    }
    Inventory(int stock){
        this("",stock);
    }
    Inventory(){
        this("",0);
    }
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return this.stock;
    }
    public void  addStock(int amount){
        if(amount > 0)
            this.stock += amount;
    }
    public void removeStock(int amount){
        if (amount > 0 && amount <= this.stock)
            this.stock -= amount;
    }
}
