package InheritancePolymorphism;


public class Main {
    public static void main(String[] args) {
        // This also called Polymorphism
        // Dễ dàng nhận thấy mặc dù bên trong class con - cash payment
        // Không hề có Balance hay SetBalance nhưng vẫn có thể sử dụng của class cha

        // Để ý thấy kiểu Payment đều có thể khởi tạo bằng CashPayment hay CreditCardPayment
        Payment myCashPayment = new CashPayment();
        myCashPayment.SetBalance(1000);
        myCashPayment.pay(100);

        Payment myCreditPayment = new CreditCardPayment();
        myCreditPayment.Balance = 1000; // Do you notice here?
        myCreditPayment.pay(100);
    }
}