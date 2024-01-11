package Threading;

// Counter class to be shared by multiple threads
class Counter {
    private int count = 0;

    // Method to increment the counter
    synchronized void increment() {
        count++;
    }

    // Method to get the current value of the counter
    int getCount() {
        return count;
    }
}

// Worker class that implements the Runnable interface
class Worker implements Runnable {
    private Counter counter;

    Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// Main class to demonstrate the multithreading example
public class test {
    public static void main(String[] args) {
        // Create a shared counter
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(new Worker(counter));
        Thread thread2 = new Thread(new Worker(counter));

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final value of the counter
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
