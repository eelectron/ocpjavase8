package ch2;

interface MyInterface {
	default int doStuff() {
		return 42;
	}
}