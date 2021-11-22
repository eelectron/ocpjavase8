package ch6;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {
		String[] sa = {"one", "two", "three", "four"};
		List<String> sList = Arrays.asList(sa);
		
		sa[0] = "five";
		System.out.println(Arrays.toString(sa));
		System.out.println(sList);
		
		sList.set(2, "nine");
		System.out.println(Arrays.toString(sa));
		System.out.println(sList);
	}
}