package Polymorphism;

import InheritancePolymorphism.Payment;

public class CreditCardPayment implements IPayment {
    public double Balance;

    @Override
    public double GetBalance() {
        return Balance;
    }

    @Override
    public void SetBalance(double amount) {
        this.Balance = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by credit card");
        this.Balance = this.Balance - (amount + amount * 10/100);
        System.out.println("Remaining: " + this.GetBalance());
    }
}