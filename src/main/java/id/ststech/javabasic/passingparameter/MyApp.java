package id.ststech.javabasic.passingparameter;

public class MyApp {

	public static void main(String[] args) {

		int x = 3;
		int y = 8;

		System.out.println("Before swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		Swap.swap(x, y);

		System.out.println("After swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		// Using by Reference

		Number m = new Number(3);
		Number n = new Number(8);
		

		System.out.println("Before swap");
		System.out.println("m = " + m);
		System.out.println("n = " + n);

		Swap.swapNumber(m, n);
		
		System.out.println("After swap");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}

}
