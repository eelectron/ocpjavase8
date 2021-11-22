package ch10threads;

public class Question9 {
	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		
		System.out.println("X");
		
		synchronized(t) {
			t.wait(20000);
		}
		
		System.out.println("Y");
	}
}