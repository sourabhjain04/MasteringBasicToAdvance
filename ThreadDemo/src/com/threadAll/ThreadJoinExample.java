package com.threadAll;

public class ThreadJoinExample {

	public static void main(String[] args) {
		System.out.println("main thread Started...");
		
		// creating worker threads
		Worker worker1= new Worker("worker 1");
		Worker worker2 =new Worker("worker 2");
		Worker worker3 = new Worker("worker 3");
		
		// starting the threads
		worker1.start();
	 
		worker2.start();
		worker3.start();
	
	
	try {
		// main thread waits for worker 1 
		worker1.join();
		System.out.println("Worker 1 has finished . Main Thread resumes");
		
		//main thread waits for worker2 to complete
		
		worker2.join();
		System.out.println("Worker 2 has finished . Main Thread resumes");
		
		//main thread waits for worker3 to complete
		
				worker3.join();
				System.out.println("Worker 3 has finished . Main Thread resumes");
	}catch (InterruptedException e) {
		System.out.println("Main Thread Intrrupted");
	}
		
	System.out.println("main thread finished");
	}
	
	
	
}
