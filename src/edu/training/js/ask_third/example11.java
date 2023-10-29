package edu.training.js.ask_third;

public class example11 {

	public static void main(String[] args) {
		
		int number = 1234; 
		String s = Integer. toString(number) ;
		int even = 1;
		int odd = 1;
		double quotient = 0;
		
        for ( int i=0; i<s.length(); i++ ) {
	        if ("02468".contains( s.substring(i,i+1) )) {
	        	even = even * Integer.parseInt(s.substring(i,i+1));
	        } else {
	        	odd = odd * Integer.parseInt(s.substring(i,i+1));
	        }
        }
        System.out.println("Призведение четных цифр = " + even);
        System.out.println("Призведение нечетных цифр = " + odd);
        
        if (odd > 0) {
        	quotient = (double)even / odd;
        	System.out.println("Частное = " + quotient);
        }else {
        	System.out.println("Частное = " + quotient);
        }

	}

}
