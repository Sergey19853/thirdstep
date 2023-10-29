package edu.training.js.ask_third;

public class example10 {

	public static void main(String[] args) {
		
        int m = 245;
        int n = 6;

        double result = (double) m / n;

        int majorDigit = (int) ((result * 10) % 10);
        int minorDigit = (int) (result % 10);
        
        System.out.println("result = " + result);
        System.out.println("Старшая цифра дробной части: " + majorDigit);
        System.out.println("Младшая цифра целой части: " + minorDigit);

	}

}
