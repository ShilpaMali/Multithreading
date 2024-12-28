package com.velocity.implement;

//2. by implementing runnable interface
public class Example implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example=new Example();
		Thread t1=new Thread(example);    //t1 is thread
		//t1 is in new or born state
				t1.start();
				//t1 will enter into ready or runnable state
				//TS-> will decide which thread I want to execute
				//t1- execute-> enter into running state(run() method)

	}

}
