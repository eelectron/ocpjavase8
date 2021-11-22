package ch10threads;

public class ManyNames {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		one.setName("Fred");
		
		Thread two = new Thread(nr);
		two.setName("Lucy");
		
		one.start();
		two.start();
	}
}

class NameRunnable implements Runnable{
	public void run() {
		int n = 10;
		for(int i = 0; i < n; i++) {
			System.out.println("Run by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}