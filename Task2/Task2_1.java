package HomeWork2;

import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println("In direct order");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("In reverse order");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
