package ch10threads;

public class TestThreads {
	public static void main(String[] args) {
		MyRunnable job = new MyRunnable();
		Thread t1 = new Thread(job);
		t1.setName("T1");
		t1.start();
	}
}