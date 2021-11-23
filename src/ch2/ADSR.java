package ch2;

public final class ADSR {
	private final StringBuilder name;
	private final int attack;
	private final int decay;
	
	public ADSR(StringBuilder name, int attack, int decay) {
		this.name = new StringBuilder(name);
		this.attack = attack;
		this.decay = decay;
	}
	
	
	public StringBuilder getName() {
		StringBuilder nameCopy = new StringBuilder(name);
		return nameCopy;
	}
	
	public ADSR getADSR() {
		return this;
	}
}
