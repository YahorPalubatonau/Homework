package HomeWork8;

import java.util.Scanner;

public class Task5 {
	static boolean isLat(String str) {
		return str.matches("[a-zA-Z]+");
	}

	static boolean isDifferen(String str) {

		int vowelCount = str.length() - str.toLowerCase().replaceAll("a|e|i|o|u|", "").length();
		int consonantCount = str.length() - vowelCount;
		if (vowelCount == consonantCount) {
			return true;
		} else {
			return false;
		}
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
		int countLatWords = 0;
		int countwordsWithMatchVowelAndConsant = 0;
		for (int i = 0; i < array.length; i++) {

			if (isLat(array[i]) == true) {
				countLatWords++;
				if (isDifferen(array[i]) == true) {
					countwordsWithMatchVowelAndConsant++;
				}
			} else {
				System.out.println("The word contains other characters = " + array[i]);
			}

		}
		System.out.println("Count of words on Lat = " + countLatWords + " ; "
				+ "Count of words with match vowel And consant = " + countwordsWithMatchVowelAndConsant + ".");
	}
}