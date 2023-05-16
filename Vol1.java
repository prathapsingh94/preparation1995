package com.onesoft.question5;

public class Vol1 {
	private static volatile int counter = 0;

	public static void main(String[] args) {
	Thread t1 = new Thread(() -> {
	int localcounter = counter;
	while (localcounter <= 5) {
	if (localcounter != counter) {
	System.out.println("T1=" + localcounter);
	localcounter = counter;
	}
	}
	});

	Thread t2 = new Thread(() -> {
	int localcounter = counter;
	while (localcounter <= 5) {
	System.out.println("T2:" + localcounter);
	counter = ++localcounter;
	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	}
	}
	});
	t1.start();
	t2.start();
	}
}
