package id.ststech.javabasic.passingparameter;

public class Number {

	private int value;

	
	public Number(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.getValue());
	}
}
