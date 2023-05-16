package com.onesoft.question5;

public class Multi extends Thread {
	public void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread one running");
		}
	}

	public void disp() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Thread Two Running");
		}
	}

	public static void main(String[] args) throws Exception {
		Multi m=new Multi();
		Thread m1 = new Thread(m::show);
		Thread m2 = new Thread(m::disp);
		m1.start();
		Thread.sleep(3000);
		m2.start();
	}
//		//public void run() {
//		for (int i=0;i<3;i++) {
//		System.out.println(i);
//		}

}
