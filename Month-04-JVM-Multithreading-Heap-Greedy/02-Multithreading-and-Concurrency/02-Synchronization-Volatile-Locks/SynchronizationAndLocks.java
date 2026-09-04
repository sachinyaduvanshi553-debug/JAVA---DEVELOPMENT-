package month04.concurrency.locks;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock(true); // Fair lock

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock(); // Always release in finally block
        }
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}

public class SynchronizationAndLocks {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000.0);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) account.deposit(1.0);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) account.deposit(2.0);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final thread-safe balance (Expected 4000.0): " + account.getBalance());
    }
}
