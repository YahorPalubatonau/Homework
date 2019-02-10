package HomeWork10;

import java.util.Scanner;

public class ScannerString {

	private static String line;
	private static int number;

	public static int createNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		number = scanner.nextInt();

		return number;
	}

	public static String createText() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter line :");
		line = scanner.nextLine();
		@SuppressWarnings("resource")
		Scanner scanner2 = new Scanner(line);

		scanner2.useDelimiter("/");

		while (scanner2.hasNext()) {
			System.out.println(scanner2.next().trim());
		}
		System.out.println();
		return line;
	}

}