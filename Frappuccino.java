package CoffeeShop;

public class Frappuccino extends Drink{
    private boolean whipped;

    Frappuccino(String size, boolean whipped){
        super("Frappuccino",40,"");
        this.whipped = whipped;
    }
    @Override
    double calculateFinalPrice() {
        return super.getBasePrice() + (whipped ? 15 : 0) + super.getSizeExtra();
    }
    public String toString(){
        return super.toString() + (whipped ? "Added whipped 15 Baht." : "") +
                "Total price = " + calculateFinalPrice() + " Baht.";
    }
}
