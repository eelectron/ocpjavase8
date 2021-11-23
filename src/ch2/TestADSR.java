package ch2;

public class TestADSR {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Hello");
		ADSR a1 = new ADSR(name, 2, 4);
		ADSR a2 = a1.getADSR();
		System.out.println(a1.getName());
		name.append("World");
		System.out.println(a1.getName());
	}
}
