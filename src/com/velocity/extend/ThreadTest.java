package com.velocity.extend;


//by extending Thread class
public class ThreadTest extends Thread {
	
	//print number from 1 to 5
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		ThreadTest thread=new ThreadTest();
		
		//thread.run();           not good approach
		thread.start();         //calling run() method
	}

}
