package edu.training.js.ask_third;

public class example09 {

	public static void main(String[] args) {
		
        long bytes = 12345678L;

        double kBytes = bytes / Math.pow(2, 10);
        double mBytes = bytes / Math.pow(2, 20);
        double gBytes = bytes / Math.pow(2, 30);
        double tBytes = bytes / Math.pow(2, 40);
        double pBytes = bytes / Math.pow(2, 50);

        System.out.println(kBytes + " Кб");
        System.out.println(mBytes + " Мб");
        System.out.println(gBytes + " Гб");
        System.out.println(tBytes + " Тб");
        System.out.println(pBytes + " Пб");

	}

}
