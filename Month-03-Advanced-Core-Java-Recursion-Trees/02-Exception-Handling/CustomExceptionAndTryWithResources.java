package month03.advanced.exceptions;

class InsufficientBalanceException extends Exception {
    private final double deficit;

    public InsufficientBalanceException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() { return deficit; }
}

class DatabaseConnection implements AutoCloseable {
    public void executeQuery(String sql) {
        System.out.println("Executing SQL: " + sql);
    }

    @Override
    public void close() {
        System.out.println("DatabaseConnection closed safely via AutoCloseable.");
    }
}

public class CustomExceptionAndTryWithResources {
    public static void main(String[] args) {
        // Try-with-resources statement ensures close() execution even if an exception occurs
        try (DatabaseConnection conn = new DatabaseConnection()) {
            conn.executeQuery("SELECT * FROM accounts WHERE id = 1");
            withdraw(100, 250);
        } catch (InsufficientBalanceException e) {
            System.err.println("Caught Custom Checked Exception: " + e.getMessage() + " | Deficit: $" + e.getDeficit());
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Account balance insufficient", amount - balance);
        }
    }
}
