package ch10threads;

public class TestShow {
	public static void main(String[] args) {
		TestShow testThreads = new TestShow();
		testThreads.go();
	}

	public void go() {
		Thread t1 = new Thread(() -> {
			ticketAgentBooks("1A");
			ticketAgentBooks("1B");
		});
		
		Thread t2 = new Thread(() -> {
			ticketAgentBooks("1A");
			ticketAgentBooks("1B");
		});
		
		t1.start();
		t2.start();
	}
	
	public void ticketAgentBooks(String seat) {
		Show show = Show.getInstance();
		System.out.println(Thread.currentThread().getName() + ": " + show.bookSeat(seat));
	}
}
