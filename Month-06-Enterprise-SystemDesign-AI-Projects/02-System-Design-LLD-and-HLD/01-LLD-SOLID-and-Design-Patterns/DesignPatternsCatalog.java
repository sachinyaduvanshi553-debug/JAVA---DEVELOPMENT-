package month06.lld.patterns;

// 1. Singleton Pattern (Double-Checked Locking, Thread-Safe)
class DatabaseConnectionPool {
    private static volatile DatabaseConnectionPool instance;

    private DatabaseConnectionPool() {
        System.out.println("Initializing Database Connection Pool...");
    }

    public static DatabaseConnectionPool getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionPool.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionPool();
                }
            }
        }
        return instance;
    }
}

// 2. Factory Pattern
interface Notification {
    void notifyUser();
}
class EmailNotification implements Notification {
    public void notifyUser() { System.out.println("Sending Email Notification"); }
}
class SmsNotification implements Notification {
    public void notifyUser() { System.out.println("Sending SMS Notification"); }
}
class NotificationFactory {
    public static Notification createNotification(String channel) {
        if ("EMAIL".equalsIgnoreCase(channel)) return new EmailNotification();
        if ("SMS".equalsIgnoreCase(channel)) return new SmsNotification();
        throw new IllegalArgumentException("Unknown notification channel: " + channel);
    }
}

// 3. Strategy Pattern
interface PaymentStrategy {
    void pay(double amount);
}
class CreditCardStrategy implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Paid $" + amount + " via Credit Card."); }
}
class UpiStrategy implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Paid $" + amount + " via UPI."); }
}
class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy strategy) { this.paymentStrategy = strategy; }
    public void checkout(double amount) { paymentStrategy.pay(amount); }
}

public class DesignPatternsCatalog {
    public static void main(String[] args) {
        // Singleton Demo
        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();

        // Factory Demo
        Notification notif = NotificationFactory.createNotification("EMAIL");
        notif.notifyUser();

        // Strategy Demo
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new UpiStrategy());
        cart.checkout(499.0);
    }
}
