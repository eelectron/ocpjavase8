package ch10threads;

public class Logger {
	private StringBuilder contents = new StringBuilder();
	
	// need to synchronize
	public void log(String message) {
		contents.append(System.currentTimeMillis());
		contents.append(": ");
		contents.append(Thread.currentThread().getName());
		contents.append(message);
		contents.append("\n");
	}
	
	// need to synchronize
	public String getContents() {
		return contents.toString();
	}
}
