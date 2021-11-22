package ch9_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example0 {
	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5};
		Stream<Integer> myStream = Arrays.stream(nums);
		long n = myStream.filter(i -> i > 3).count();
		
		System.out.println("n = " + n);
		//long m = myStream.filter(i -> i > 3).count();
		
		String[] dogs = {"Boi", "Zooey", "Charis"};
		Stream<String> dogStream = Arrays.stream(dogs);
		
		System.out.println("Number of dogs :" + dogStream.count());
		
		
		List<String> names = Arrays.asList("Boi", "Charis", "Zooey", "Bokeh", "Clover", "Aiko");
		names.stream().filter(s -> s.startsWith("B") || s.startsWith("C")).filter(s -> s.length() > 3)
		.forEach(System.out::println);
	}
}