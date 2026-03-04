package Abstraction;


public class CashPayment implements IPayment {
    public double Balance;

    @Override
    public double GetBalance() {
        return Balance;
    }

    @Override
    public void SetBalance(double amount) {
        this.Balance = amount;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " by cash");
        System.out.println("Remaining: " + this.GetBalance());
    }
}
