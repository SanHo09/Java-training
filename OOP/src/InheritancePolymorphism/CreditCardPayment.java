package InheritancePolymorphism;

public class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by credit card");
        this.Balance = this.Balance - (amount + amount * 10/100);
        System.out.println("Remaining: " + this.GetBalance());
    }
}
