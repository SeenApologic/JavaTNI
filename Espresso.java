package CoffeeShop;

public class Espresso extends Drink{
    private int shot;

    Espresso(String size) {
        super("Espresso",35,size);
        this.shot = 0;
    }
    public void addShot(int shot){
        this.shot++;
    }
    public int getShot(){
        return this.shot;
    }

    @Override
    double calculateFinalPrice() {
        return super.getBasePrice() + (this.shot * 15) + super.getSizeExtra();
    }

    @Override
    public double getSizeExtra() {
        return 0;
    }
    public String toString(){
        return super.toString() + (this.shot > 0 ? "\nAdded " + this.shot + " shot" : "" ) +
                "\nTotal price = " + calculateFinalPrice();
    }
}
