package id.ststech.javabasic.passingparameter;

public class Swap {

	public static void swap ( int a, int b ) {
	
		// Anggap a adalah Gelas A
		// Anggap b adalah Gelas B
		// Anggap c adalah Gelas C Kosong
		
		int c = a; // Step 1
		a = b; // Step 2
		b = c; // Step 3
	}
	
	public static void swapNumber ( Number a, Number b ) {
		int c = a.getValue();
		a.setValue(b.getValue());
		b.setValue(c);
	}
}
