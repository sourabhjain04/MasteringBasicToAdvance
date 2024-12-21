package com.threadAll;

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


