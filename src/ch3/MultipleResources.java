package ch3;

public class MultipleResources {
	class Lamb implements AutoCloseable{
		public void close() throws Exception{
			System.out.println("l");
		}
	}
	
	class Goat implements AutoCloseable{
		public void close() throws Exception{
			System.out.println("g");
		}
	}
	
	public static void main(String[] args) throws Exception{
		new MultipleResources().run();
	}
	
	public void run() throws Exception{
		try(Lamb l = new Lamb();
				Goat g = new Goat()){
			System.out.println("2");
		}
		finally {
			System.out.println("f");
		}
	}
}
