package month02.oop.constructors;

public class ConstructorsAndThis {
    private final String id;
    private String name;
    private double balance;

    // Default Constructor chaining to parameterized constructor
    public ConstructorsAndThis() {
        this("ACC-DEFAULT", "Anonymous", 0.0);
    }

    // Parameterized Constructor using 'this' keyword to resolve shadow variables
    public ConstructorsAndThis(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.printf("Account[ID: %s, Name: %s, Balance: $%.2f]%n", id, name, balance);
    }

    public static void main(String[] args) {
        ConstructorsAndThis acc1 = new ConstructorsAndThis();
        ConstructorsAndThis acc2 = new ConstructorsAndThis("ACC-101", "Sachin", 5000.0);
        acc1.display();
        acc2.display();
    }
}
