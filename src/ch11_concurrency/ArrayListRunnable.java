package ch11_concurrency;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunnable implements Runnable{
	private List<Integer> list = new ArrayList<>();
	
	public ArrayListRunnable() {
		for(int i = 0; i < 10000; i++) {
			list.add(i);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tName = Thread.currentThread().getName();
		while(!list.isEmpty()) {
			System.out.println(tName + " removed " + list.remove(0));
		}
	}
	
	public static void main(String[] args) {
		ArrayListRunnable alr = new ArrayListRunnable();
		Thread t1 = new Thread(alr);
		Thread t2 = new Thread(alr);
		
		t1.start();
		t2.start();
	}	
}