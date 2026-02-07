public class Bakery {
    private String flavor;
    private double unitPrice;
    private int packingCost = 5;

    Bakery(String flavor, double unitPrice){
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }
    Bakery(){
        this("",0);
    }
    public String getFlavor(){
        return this.flavor;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public int getPackingCost(){
        return this.packingCost;
    }
    public double calculateTotalPrice(){
        return unitPrice + packingCost;
    }
    public String toString(){
        return "Thanks you for order!";
    }

}
