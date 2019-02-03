package HomeWork8;

import java.util.Scanner;

public class Task6 {

	public static boolean checkChar(String array) {

		for (int i = 0; i < array.length() - 1; i++) {
			if (array.charAt(i) > array.charAt(i + 1)) {
				return false;
			}
		}
		return true;

	}

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
		for (int i = 0; i < array.length; i++) {
			if (checkChar(array[i]) == true) {
				System.out.println("Characters appear in strict order of increasing their codes : " + array[i]);
			} else {
				System.out.println("Characters do not appear in strict order of increasing their codes : " + array[i]);
			}
		}
	}
}