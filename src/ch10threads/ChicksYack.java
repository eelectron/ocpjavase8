package ch10threads;

public class ChicksYack implements Runnable{
	static Chicks c;
	public static void main(String[] args) {
		new ChicksYack().go();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.yack(Thread.currentThread().getId());
	}

	void go() {
		c = new Chicks();
		new Thread(new ChicksYack()).start();
		new Thread(new ChicksYack()).start();
	}
}

class Chicks{
	synchronized void yack(long id) {
		for(int x = 1; x < 3; x++) {
			System.out.println(id + " ");
			Thread.yield();
		}
	}
}