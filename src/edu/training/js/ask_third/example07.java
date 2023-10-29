package edu.training.js.ask_third;

public class example07 {

	public static void main(String[] args) {

        int сurrentHours = 10;
        int currentMinutes = 20;
        int currentSeconds = 30;

        int p = 115;
        int q = 30;
        int r = 40;

        int timeInSeconds = сurrentHours * 3600 + currentMinutes * 60 + currentSeconds + p * 3600 + q * 60 + r;

        int hours = (timeInSeconds / 3600);
        int minutes = (timeInSeconds - (hours * 3600)) / 60;
        int seconds = (timeInSeconds - (hours * 3600)) - (minutes * 60);
        int hours24Format = 0;
        if (hours > 23){
            hours24Format = hours - (int)(hours / 24) * 24;
        }
        else {
            hours24Format = hours;
        }

        System.out.println(hours24Format + " ч. " + minutes + " мин. " + seconds + " c.");

	}

}
