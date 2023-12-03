//package main.java.ShtapperGregoriy;//package main.java.ShtapperGregoriy.service;


import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
	public static void maina(String[] args) {
//		ClientOperationMain.mainx();
//
		Scanner scanner = new Scanner(System.in);

		int[] temperatures = new int[30];
		boolean[] isFilled = new boolean[30];
		while (true){
			System.out.println("Введи 2 числа: дата и температура");
			String input = scanner.nextLine();

			if ("н".equals(input) || "Н".equals(input)) break;

			String[] parts = input.split(" ");
			int day = parseInt(parts[0]) - 1;
			int temperature = parseInt(parts[1]);

			temperatures[day] = temperature;
			isFilled[day] = true;

			double sum = 0;
			for(int t : temperatures) sum += t;

			int cnt = 0;
			for (boolean f: isFilled) if (f) cnt++;

			System.out.println("Средняя темперетура: " + sum/cnt);
		}
	}
}
