package Abstraction;

public interface IPayment {
    public double GetBalance();
    public void SetBalance(double amount);
    public abstract void pay(double amount);
}
