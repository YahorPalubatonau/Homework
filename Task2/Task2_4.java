package HomeWork2;

import java.util.Scanner;

//import java.util.Scanner;

public class Task2_4 {
//	public static void main(String[] args) {
//		int count = 0;
//		@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter mas size :");
///		int size_double = scanner.nextInt();
///		double[] array = new double[size_double];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = Math.random() * 10;
//			if (array[i] == 0) {
//				count++;
//			}
//		}
//		if (count == 0)
//			System.out.println("No zero elements");
//		else {
//			System.out.println("The number of zero elements = " + count);
//		}
//	}
//}
//2
//public class Task2_4 {
//
//	public static void main(String[] args) {
//		int size = 10;
//		int count = 0;
//		double[] array = new double[size];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = Math.random() * 10;
//			if (array[i] == 0) {
//				count++;
//			}
//		}
//		if (count == 0)
//			System.out.println("No zero elements");
//		else {
//			System.out.println("The number of zero elements =" + count);
//		}
//	}
//}
//3
//public class Task2_4 {
	
	
	
	
	
	

	// public static void main(String[] args) {
	int count = 0;
	double[] array = { 1.11, 0.0, 65.76, 87, 65, 65, 87, 0.0, 0.0, 43.67 };

	public static void checkForZeroElementCount(double[] array, int count) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}
		if (count == 0)
			System.out.println("No zero elements");
		else {
			System.out.println("The number of zero elements =" + count);
		}
	}
}
//}
