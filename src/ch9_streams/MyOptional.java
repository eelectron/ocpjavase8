package ch9_streams;

import java.util.Optional;
import java.util.stream.Stream;

public class MyOptional {
	public static void main(String[] args) {
		Stream<Double> ds = Stream.of(1.0,2.0,3.0,4.0,5.0);
		
		Optional<Double> aNum = ds.findFirst();
		if(aNum.isPresent()) {
			System.out.println(aNum.get());
		}
		else {
			System.out.println("Empty");
		}
	}
}
