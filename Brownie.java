public class Brownie extends Bakery{
    private double kg;

    Brownie(double kg, String flavor, double pricePerKg){
        super(flavor, pricePerKg);
        this.kg = kg;
    }
    public double getToAdd(){
        if (kg > 15.0)
            return kg < 15 ? 0 : (int)(kg / 15) * 2;
        return this.kg;
    }
    @Override
    public double calculateTotalPrice(){
        return this.kg * getUnitPrice();
    }
    public String toString(){
        return super.toString() + "\nYou choice flavor: " + getFlavor()
                + "You get a free Brownie!!! = " + (int)getToAdd() + " kilograms."
                + "\nTotal price " + calculateTotalPrice() + " baht.";
    }
}
