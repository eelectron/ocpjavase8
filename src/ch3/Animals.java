package ch3;

import java.io.Closeable;
import java.io.IOException;

public class Animals {
	class Lamb implements Closeable{
		public void close() {
			throw new RuntimeException("a");
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Animals().run();
	}
	
	public void run() throws Exception{
		try (Lamb l = new Lamb();){
			throw new IOException();
		}
		catch(Exception e) {
			throw new RuntimeException("c");
		}
	}
}