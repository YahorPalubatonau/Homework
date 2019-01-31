package HomeWork3;

import java.util.Scanner;

public class Task4 {

	// Raise the number to the cube, return the result of the construction

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = scanner.nextInt();
		System.out.println("The result of the construction = " + printCube(number));
	}

	public static int printCube(int a) {
		int power = 3;
		return (int) (Math.pow(a, power));
	}

}
