package edu.training.js.ask_third;

import java.util.Scanner;

public class example08 {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		String str;
		System.out.print("Enter one character > ");
		str = scanner.next();
		System.out.println("str=" + str);
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		int code = ch;
		System.out.println("code = " + code);
		
		System.out.println("prev = " + (char)(code - 1) );
		System.out.println("next = " + (char)(code + 1) );

	}

}
