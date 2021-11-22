package ch9_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duck {
	String name, color;
	int age;
	
	public Duck(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		List<Duck> ducks = Arrays.asList(new Duck("Jerry", "yellow", 3), new Duck("George", "brown", 4)
				,new Duck("Kramer", "mottled", 6),
				new Duck("Elaine", "white", 2),
				new Duck("Huey", "mottled", 2));
		
		ducks.stream().collect(Collectors.groupingBy(d -> d.getColor())).forEach((c, du) -> {
			System.out.print("Ducks who are " + c + ": ");
			du.forEach(d -> System.out.print(d.getName() + " "));
			System.out.println();
		});
	}
}
