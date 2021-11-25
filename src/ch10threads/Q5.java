package ch10threads;

public class Q5 {
	public static void main(String[] args) {
		System.out.println("1 ");
		synchronized(args) {
			System.out.println("2 ");
			try {
				args.wait();
			}
			catch(InterruptedException ex) {
				
			}
		}
		
		System.out.println("3 ");
	}
}
