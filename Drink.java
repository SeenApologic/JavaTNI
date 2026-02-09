package CoffeeShop;

public abstract class Drink implements Priceable {
    private String drinkName;
    private double basePrice;
    private String size;

    Drink(String drinkName, double basePrice, String size){
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = this.size.toUpperCase();
    }
    public String getDrinkName(){
        return this.drinkName;
    }

    abstract double calculateFinalPrice();

    @Override
    public double getBasePrice(){
        return this.basePrice;
    }
    @Override
    public double getSizeExtra(){
        if (size.equalsIgnoreCase("S")) return 0;
        if (size.equalsIgnoreCase("M")) return 10;
        if (size.equalsIgnoreCase("L")) return 15;
        return -1;
    }
    public String toString(){
        return "Your order: " + drinkName + "(size: " + getSizeExtra() + ")";
    }
}
