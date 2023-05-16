package com.onesoft.question5;

public class Volatile {
    private volatile int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Volatile example = new Volatile();

        // Start a thread to increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                example.incrementCounter();
            }
        });

        // Start another thread to read the counter
        Thread thread2 = new Thread(() -> {
            while (example.getCounter() < 10000) {
                // do nothing
            }
            System.out.println("Counter reached 1000000");
        });

        thread1.start();
        thread2.start();
    }
}

