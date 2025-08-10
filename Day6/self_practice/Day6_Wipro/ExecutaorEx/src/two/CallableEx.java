package two;

//2.Example with Callable and Future (returning result):

import java.util.concurrent.*;

public class CallableEx {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a Callable task that returns a result
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Result from Callable";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Task submitted, waiting for result...");
        String result = future.get();  // Blocks until result is available
        System.out.println("Received: " + result);

        executor.shutdown();
    }
}
