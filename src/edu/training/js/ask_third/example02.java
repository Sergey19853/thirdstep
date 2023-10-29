package edu.training.js.ask_third;

public class example02 {

	public static void main(String[] args) {
		double a = 5;
		double b = 19;
		double c = 10;
		
		double x1;
		double x2;
		
		double D;

		D = Math.pow(b, 2) - 4 * a * c;
		
		if(D < 0) {
			System.out.println("Корней нет");
			return;
		}
		
		if(D == 0) {
			x1 = (-b  / (2 * a));
			System.out.println("x = " + x1);
			return;
		}		

		x1 = ((-b + Math.sqrt(D)) / (2 * a));
		x2 = ((-b - Math.sqrt(D)) / (2 * a));

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}

}
