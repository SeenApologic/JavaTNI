package Banking;

import java.io.File;

public class BankAccount {
    private String accId;
    private double accBalance;
    private final String filename = "src/Banking/users_account";

    BankAccount(String accId, double accBalance){
        this.accId = accId;
        this.accBalance = accBalance;
    }
    BankAccount(String accId){
        this(accId,0);
    }
    BankAccount(){
        this("",0);
    }
    public  String getAccount(){
        return  accId;
    }
    public String getAccId(){
        return accId;
    }
    public void setAccBalance(double accBalance){
        this.accBalance = accBalance;
    }
    public double getAccBalance(){
        return accBalance;
    }
    public String getFilename(){
        return filename;
    }
    public String toString(){
        return accId + "," + accBalance;
    }
}
