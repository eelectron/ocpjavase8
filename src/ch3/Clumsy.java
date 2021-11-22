package ch3;

public class Clumsy {
	public static void main(String[] args) {
		int j = 7;
		assert(++j > 7);
		assert(++j > 8): "hi";
		assert(j > 10): j = 12;
		assert(j == 12): doStuff();		// exp 2 must return a value
		assert(j == 12): new Clumsy();
	}
	
	static int doStuff() {return 1;}
}