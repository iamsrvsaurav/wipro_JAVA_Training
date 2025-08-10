package one;

//ExecutorService from the java.util.concurrent package to 
//manage and execute multiple tasks using a thread pool.

//1.Basic Example: ExecutorService with Runnable Tasks

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing Task " + taskId + " by " + 
                				Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Completed Task " + taskId);
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
