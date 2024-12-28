package com.velocity.methods.thread;

public class SampleDemo extends Thread {
	public static void main(String[]args) {
		
		SampleDemo t1=new SampleDemo();
		long id=t1.getId();
		System.out.println(id);
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
	}

}
