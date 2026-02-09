package Customer;

public class Member extends Customer implements Rewardable{
    private String member_level;

    Member(String name, double billAmount, String member_level){
        super(name,billAmount);
        this.member_level = member_level;
    }
    @Override
    double calculateFinalBill() {
        return super.getBillAmount() - (super.getBillAmount() * getDiscountRate());
    }
    @Override
    public double getDiscountRate() {
        if (this.member_level.equalsIgnoreCase("gold")) return 0.15;
        if (this.member_level.equalsIgnoreCase("premium")) return 0.20;
        return 0;
    }
    @Override
    public int collectPoints() {
        return (int) super.getBillAmount() / 100;
    }
    public String toString(){
        return super.toString() +  "\nMember level: " + member_level + "(Discount " + getDiscountRate() + ")" +
                "\nGet Point: " + collectPoints() + "\nTota Price: " + calculateFinalBill();
    }
}
