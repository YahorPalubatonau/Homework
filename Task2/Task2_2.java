package HomeWork2;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter mas size :");
		int size_double = scanner.nextInt();
		double[] array = new double[size_double];
		int limit = 0;
		double multiply = 1;
		while (limit < array.length) {
			array[limit] = Math.random() * 10;
			multiply = multiply * array[limit];
			limit++;
		}
		System.out.println("Total = " + multiply);
	}

}
