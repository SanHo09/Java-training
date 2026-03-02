package InheritancePolymorphism;

public class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by cash");
        this.Balance = this.Balance - amount;
        System.out.println("Remaining: " + this.GetBalance());
    }
}
