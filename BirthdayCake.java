public class BirthdayCake extends Bakery{
    private String message;
    private double pound;

    BirthdayCake(String message, double pound, String flavor, double unitPrice){
        super(flavor,unitPrice);
        this.message = message;
        this.pound = pound;
    }
    public String getMessage(){
        return this.message;
    }
    public void changeMessage(String new_message){
        this.message = new_message;
    }
    @Override
    public int getPackingCost(){
        if (this.pound >= 3)
            return 10;
        return super.getPackingCost();
    }
    @Override
    public double calculateTotalPrice(){
        return (getUnitPrice() * this.pound) + getPackingCost();
    }
    public String toString(){
        return super.toString() + "\n" + getFlavor() + " birthday cake (message=" + message + ")" +
                "\ntotal price of Birthday Cake = " + calculateTotalPrice();
    }

}
