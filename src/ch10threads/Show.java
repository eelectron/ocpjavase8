package ch10threads;

import java.util.HashSet;
import java.util.Set;

public class Show {
	private volatile static Show INSTANCE;
	private Set<String> availableSeats;
	
	// need to synchronize
	public static synchronized Show getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Show();
		}
		return INSTANCE;
	}

	private Show() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	// need to synchronize
	public synchronized boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
}