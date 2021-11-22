package ch2;

public class Bottom2 extends Top{
	public Bottom2(String s) {
		super(s);
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		new Bottom2("C");
		System.out.println(" ");
	}
}


class Top{
	public Top(String s) {
		System.out.print("B");
	}
}