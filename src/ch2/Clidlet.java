package ch2;

public class Clidlet extends Clidder{
	public final void flipper() {
		System.out.println("Clidlet");
	}
	
	public static void main(String[] args) {
		new Clidlet().flipper();
	}
}

class Clidder{
	private final void flipper() {
		System.out.println("Clidder");
	}
}