package ch9_streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
	
	public static void main(String[] args) {
		List<Reading> readings = Arrays.asList(new Reading(2017, 1, 1, 405.91), new Reading(2017, 1, 1, 405.98), new Reading(2017, 1, 1, 406.14), new Reading(2017, 1, 1, 406.48), new Reading(2017, 1, 1, 406.20));
		OptionalDouble avg = readings.stream().mapToDouble(r -> r.value).filter(v -> v >= 406 && v < 407).average();
		
		
		if(avg.isPresent()) {
			System.out.println(avg.getAsDouble());
		}
		else {
			System.out.println("Empty !");
		}
	}
}

class Reading{
	int year;
	int month;
	int day;
	double value;
	
	Reading(int year, int month, int day, double value){
		this.year = year;
		this.month = month;
		this.day = day;
		this.value = value;
	}
}