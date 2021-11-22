package ch3;

public class Conductor {
	static String s = "-";
	
	class Whistle implements AutoCloseable{
		public void toot() {
			s += "t";
		}
		
		@Override
		public void close() throws Exception {
			// TODO Auto-generated method stub
			s += "c";
		}
		
	}
	
	public static void main(String[] args) {
		new Conductor().run();
		System.out.println(s);
	}
	
	public void run() {
		try(Whistle w = new Whistle()){
			w.toot();
			s += "1";
			throw new Exception();
		}catch(Exception e) {
			s += "2";
		}finally {
			s += "3";
		}
	}
}
