package Customer;

public class Regular extends Customer{
    Regular(String name, double billAmount){
        super(name,billAmount);
    }
    @Override
    double calculateFinalBill() {
        return isDiscount() ? super.getBillAmount() - (super.getBillAmount() * 0.05) : super.getBillAmount();
    }
    public boolean isDiscount(){
        return super.getBillAmount() >= 500;
    }
    public String toString(){
        return super.toString() + (isDiscount() ? "\nYou get discount 5%" : "") + "\nTotal price: " + calculateFinalBill();
    }
}
