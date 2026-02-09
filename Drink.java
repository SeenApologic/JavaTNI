package CoffeeShop;

public abstract class Drink implements Priceable {
    private String drinkName;
    private double basePrice;
    private String size;

    Drink(String drinkName, double basePrice, String size){
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size.toUpperCase();
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
        return switch (size) {
            case "S" -> 0;
            case "M" -> 10;
            case "L" -> 15;
            default -> -1;
        };
    }
    @Override
    public String toString() {
        return "Your order: " + drinkName + " (Size: " + size + ")";
    }

}
