package edu.training.js.ask_third;

public class example04 {

	public static void main(String[] args) {
		
		long a = 2;
		long b;
				
		a = a * a;
		b = a;
		a = a * a;
		a = a * a;		
		System.out.println("a^8 = " + a);
		
		a = a * b;
		System.out.println("a^10 = " + a);
	}

}
