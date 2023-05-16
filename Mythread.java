package com.onesoft.question5;

public class Mythread extends Thread {
	public static void main(String[] args) {

		Mythread t1 = new Mythread();
		t1.start();
		System.out.println("This code is outside of the thread");
		}
		public void run() {
		System.out.println("This code is running in a thread");
		}

}
