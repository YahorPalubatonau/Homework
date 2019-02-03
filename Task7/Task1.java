package HomeWork8;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = scanner.nextInt();

		String[] array = new String[size];
		for (int i = 0; i < array.length; i++) {
			@SuppressWarnings("resource")
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter line :");
			String line = scanner1.nextLine();
			array[i] = line;
		}
		int indexMin = 0;
		int indexMax = 0;
		int min = array[indexMin].length();
		int max = array[indexMax].length();

		for (int i = 0; i < array.length; i++) {
			if (min > array[i].length()) {
				min = array[i].length();
				indexMin = i;
			}

			if (max < array[i].length()) {
				max = array[i].length();
				indexMax = i;
			}
		}
		System.out.println("Shotless line = " + array[indexMin] + "( Lenght = " + min + " )" + ";");
		System.out.println("Longless line = " + array[indexMax] + "( Lenght = " + max + " )" + ";");
	}

}

