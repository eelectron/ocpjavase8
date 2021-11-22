package ch10threads;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Important job running ...");
		System.out.println("Thread name : " + Thread.currentThread().getName());
	}
}