package HomeWork8;

import java.util.Scanner;

public class Task7 {

	public static int diffWords(String str) {
		StringBuffer array = new StringBuffer();
		String currentChar;
		for (int i = 0; i < str.length(); i++) {
			currentChar = String.valueOf(str.charAt(i));
			if (array.indexOf(currentChar) == -1)
				array.append(currentChar);
		}
		return array.length();
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
			if (diffWords(array[i]) == array[i].length()) {
				System.out.println(
						"Search word : " + array[i] + ", number of different characters : " + array[i].length());
				break;
			} else {
				System.out.println("This is no words with different characters in the array : " + array[i]);
			}
		}

	}
}
