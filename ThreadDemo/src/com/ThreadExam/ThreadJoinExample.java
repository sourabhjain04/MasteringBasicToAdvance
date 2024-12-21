package com.ThreadExam;
class Worker extends Thread {
    private String taskName;

    public Worker(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started...");
        try {
            // Simulating task duration
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted!");
        }
        System.out.println(taskName + " completed.");
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) {
        System.out.println("Main thread started...");

        // Creating worker threads
        Worker worker1 = new Worker("Worker 1");
        Worker worker2 = new Worker("Worker 2");
        Worker worker3 = new Worker("Worker 3");

        // Starting the threads
        worker1.start();
        worker2.start();
        worker3.start();

        try {
            // Main thread waits for worker1 to complete
            worker1.join();
            System.out.println("Worker 1 has finished. Main thread resumes.");

            // Main thread waits for worker2 to complete
            worker2.join();
            System.out.println("Worker 2 has finished. Main thread resumes.");

            // Main thread waits for worker3 to complete
            worker3.join();
            System.out.println("Worker 3 has finished. Main thread resumes.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Main thread finished.");
    }
}
