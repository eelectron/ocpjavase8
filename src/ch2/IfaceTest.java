package ch2;

public class IfaceTest implements MyInterface{
	public static void main(String[] args) {
		new IfaceTest().go();
	}
	
	void go() {
		System.out.println("class " + doStuff());
		//System.out.println("iface " + MyInterface.doStuff());
		System.out.println("iface " + MyInterface.super.doStuff());
	}
	
	public int doStuff() {
		return 43;
	}
}