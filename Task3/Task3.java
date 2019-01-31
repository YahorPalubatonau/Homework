package HomeWork3;

import java.util.Scanner;

public class Task3 {

	// Square the number, return the result of the construction

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = scanner.nextInt();
		System.out.println("The result of the construction = " + printSquare(number));
	}

	public static int printSquare(int a) {
		return a * a ;
	}
}
