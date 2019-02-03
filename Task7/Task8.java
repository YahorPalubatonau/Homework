package HomeWork8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {

	static boolean isNumber(StringBuilder str2) {
		String str = str2.toString();
		return str.matches("[0-9]+");
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

		List<StringBuilder> palindromes = new ArrayList<StringBuilder>();
		for (int i = 0; i < size; i++) {
			StringBuilder str = new StringBuilder(array[i].toString());
			if (isNumber(str) == true) {
				if (str.toString().equals(str.reverse().toString())) {
					palindromes.add(str);
				}
			}
		}
		System.out.println("Palendroms : " + palindromes);
	}
}