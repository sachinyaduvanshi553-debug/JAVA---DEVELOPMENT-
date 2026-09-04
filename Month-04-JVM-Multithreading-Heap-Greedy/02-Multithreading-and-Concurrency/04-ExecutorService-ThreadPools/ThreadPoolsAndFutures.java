package month04.concurrency.executors;

import java.util.concurrent.*;

public class ThreadPoolsAndFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int corePoolSize = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(corePoolSize);

        System.out.println("Created ThreadPool with " + corePoolSize + " worker threads.");

        // Submitting Callable tasks with Future return
        Callable<String> task1 = () -> {
            Thread.sleep(300);
            return "Task 1 completed by " + Thread.currentThread().getName();
        };

        Callable<Integer> task2 = () -> {
            int sum = 0;
            for (int i = 1; i <= 1000; i++) sum += i;
            return sum;
        };

        Future<String> future1 = executor.submit(task1);
        Future<Integer> future2 = executor.submit(task2);

        System.out.println("Result 1: " + future1.get());
        System.out.println("Result 2 (Sum 1..1000): " + future2.get());

        // Graceful shutdown
        executor.shutdown();
        if (executor.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("All worker threads terminated cleanly.");
        }
    }
}
