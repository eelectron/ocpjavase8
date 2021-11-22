package ch10threads;

public class Q12 {
	static Thread laurel, hardy;
	public static void main(String[] args) {
		laurel = new Thread() {
			
			public void run() {
				System.out.println("A");
				try {
					hardy.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("B");
				}
				System.out.println("C");
			}
		};
		
		hardy = new Thread() {
			public void run() {
				System.out.println("D");
				try {
					laurel.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
					System.out.println("E");
				}
				System.out.println("F");
			}
		};
		
		laurel.start();
		hardy.start();
	}
}
