package ch10threads;

public class Starter implements Runnable{
	void go(long id) {
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId());
		new Thread(new Starter()).start();
	}
	
	public void run() {
		go(Thread.currentThread().getId());
	}
}
