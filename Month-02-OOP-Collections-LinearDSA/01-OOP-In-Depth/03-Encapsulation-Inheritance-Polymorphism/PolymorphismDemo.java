package month02.oop.polymorphism;

// Base class
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method to enforce polymorphism
    public abstract void processPayment();
}

class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.printf("Processing UPI Payment of $%.2f via %s%n", amount, upiId);
    }
}

class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.printf("Processing Card Payment of $%.2f on card ending in %s%n", 
            amount, cardNumber.substring(cardNumber.length() - 4));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Dynamic Method Dispatch (Runtime Polymorphism)
        Payment p1 = new UpiPayment(250.0, "sachin@okhdfcbank");
        Payment p2 = new CardPayment(1200.0, "4111222233334444");

        Payment[] payments = {p1, p2};
        for (Payment p : payments) {
            p.processPayment();
        }
    }
}
