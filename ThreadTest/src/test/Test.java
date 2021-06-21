package test;

import thread.SimpleRunThread;
import thread.SimpleThread;

public class Test {

	public static void main(String[] args) {
		new SimpleThread("Thread 1").start();
		new SimpleThread("Thread 2").start();
		
		new Thread(new SimpleRunThread("Thread Runnable")).start();
	}

}
