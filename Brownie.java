public class Brownie extends Bakery{
    private double kg;

    Brownie(double kg, String flavor, double pricePerKg){
        super(flavor, pricePerKg);
        this.kg = kg;
    }
    public int getToAdd() {
        return (int)(kg / 15) * 2;
    }
    @Override
    public double calculateTotalPrice(){
        return this.kg * getUnitPrice();
    }
    public String toString(){
        return super.toString() + "\nYou choice flavor: " + getFlavor()
                + "\nYou get a free Brownie!!! = " + (int)getToAdd() + " kilograms."
                + "\nTotal price " + calculateTotalPrice() + " baht.";
    }
}
