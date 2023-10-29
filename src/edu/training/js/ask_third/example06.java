package edu.training.js.ask_third;

public class example06 {

	public static void main(String[] args) {
		
		double a = 7;
        double b = 8;
        double c = 9;

        double radianA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double degreesA = radianA * 180 / Math.PI;

        double radianB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double degreesB = radianB * 180 / Math.PI;

        double radianC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        double degreesC = radianC * 180 / Math.PI;

        System.out.println("Угол a = " + radianA + " радиан " + degreesA + " градусов");
        System.out.println("Угол b = " + radianB + " радиан " + degreesB + " градусов");
        System.out.println("Угол c = " + radianC + " радиан " + degreesC + " градусов");
        
	}

}
