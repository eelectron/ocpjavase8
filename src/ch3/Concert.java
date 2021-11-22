package ch3;

public class Concert {
	static class PowerOutage extends Exception{}
	static class ThunderStorm extends Exception{}
	
	public static void main(String[] args) {
		try {
			new Concert().listen();
		}catch(PowerOutage | ThunderStorm e) {
			//e = new PowerOutage();
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
	}
	
	public void listen() throws PowerOutage, ThunderStorm{
		
	}
}
