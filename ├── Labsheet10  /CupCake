public class CupCake extends Bakery{
    private int piece;

    CupCake(int piece, String flavor, double unitPrice){
        super(flavor,unitPrice);
        this.piece = piece;
    }
    public boolean isPackingBox(){
        return piece >= 6;
    }
    public int getBoxNumber(){
        if (isPackingBox())
            return piece / 6;
        return 0;
    }
    public int getBagNumber(){
        return this.piece % 6;
    }
    @Override
    public int getPackingCost(){
        if (isPackingBox())
            return getBoxNumber() * super.getPackingCost();
        return 0;
    }
    @Override
    public double calculateTotalPrice(){
        return (getUnitPrice() * this.piece) + getPackingCost() + (getBagNumber() * 0.5);
    }
    public String toString() {
        String result = super.toString() + "\n";
        result += "Cup cake (" + getFlavor() + ") with ";

        if (isPackingBox()) {
            result += getBoxNumber() + " Box ";
        }

        result += getBagNumber() + " Bag\n";
        result += "Total price of Cup Cake = " + calculateTotalPrice();

        return result;
    }

}
