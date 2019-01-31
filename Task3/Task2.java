package HomeWork3;

import java.util.Scanner;

public class Task2 {

	// Check even or odd, return "boolean" result

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = scanner.nextInt();
		System.out.println("Is it true that the number is even ? " + printEvenNumber(number));
	}

	public static boolean printEvenNumber(int a) {
		int indEvenOrOdd = 2;
		if (a % indEvenOrOdd == 0) {
			return true;
		} 
		else {
			return false;
		}
	}
}
