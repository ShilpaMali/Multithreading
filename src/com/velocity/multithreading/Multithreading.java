package com.velocity.multithreading;

public class Multithreading extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(600);//temporary pause thread execution for specific milliseconds
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading t1=new Multithreading();
		t1.start();
		Multithreading t2=new Multithreading();
		t2.start();

	}

}
