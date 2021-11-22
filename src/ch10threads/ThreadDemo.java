package ch10threads;

public class ThreadDemo {
	synchronized void a() {
		actBusy();
	}
	
	static synchronized void b() {
		actBusy();
	}
	
	static void actBusy() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {}
	}
	
	public static void main(String[] args) {
		final ThreadDemo x = new ThreadDemo();
		final ThreadDemo y = new ThreadDemo();
		
		Runnable runnable = () -> {
			int option = (int) (Math.random() * 4);
			switch(option) {
				case 0: x.a(); break;
				case 1: x.b(); break;
				case 2: y.a(); break;
				case 3: y.b(); break;
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
	}
}
