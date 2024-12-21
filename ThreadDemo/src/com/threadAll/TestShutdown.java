package com.threadAll;
class MyThread extends Thread{
	public void run() {
		System.out.println("Shut down hook task completed");
	}
}
public class TestShutdown {
	
	public static void main(String[] args) {
		
		
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		
		System.out.println("now main sleeping ...press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		}catch (Exception e) {
			
		}
	}

}
