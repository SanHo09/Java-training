package Polymorphism;


public class Main {
    public static void main(String[] args) {
        // Để ý thấy kiểu Payment đều có thể khởi tạo bằng CashPayment hay CreditCardPayment
        IPayment myCashPayment = new CashPayment();
        myCashPayment.SetBalance(1000);
        myCashPayment.pay(100);

        IPayment myCreditPayment = new CreditCardPayment();
        myCreditPayment.SetBalance (1000);
        myCreditPayment.pay(100);
    }
}