package Banking;

public interface Transactionable {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
