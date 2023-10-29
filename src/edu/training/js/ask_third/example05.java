package edu.training.js.ask_third;

public class example05 {

	public static void main(String[] args) {
		
		double radian;
		double doubleDegrees;
		int degrees;
		int minutes;
		int seconds;
		double tempMin;
		double tempSec;
		
        radian = 1.1;
        doubleDegrees = radian * 180 / Math.PI;
        degrees = (int) doubleDegrees;

        tempMin = (doubleDegrees - degrees) * 60;
        minutes = (int) tempMin;

        tempSec = (tempMin - minutes) * 60;
        seconds = (int) tempSec;
        
        System.out.println(degrees + " градуса(ов) " + minutes + " минут(а) " + seconds + " cекунд(а)");
        
	}

}
