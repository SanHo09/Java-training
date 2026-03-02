package InheritancePolymorphism;

public abstract class Payment {
    public double Balance;

    public void SetBalance(double amount) {
        this.Balance = amount;
    }

    public double GetBalance() {
        return this.Balance;
    }

    public abstract void pay(double amount);
}

