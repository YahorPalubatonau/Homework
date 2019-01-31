package HomeWork3;

import java.util.Scanner;

public class AddTask {
	public static void main(String[] args) {

		int start—ount = 0;
		int forMultipied = 1;

		printOrder(createArray(), start—ount);
		multiplyAll(createArray(), forMultipied);
		multiplyByTwo(createArray());
		chekForNumberElementWithZero(createArray(), start—ount);
		checkForZeroElementCount(createArray(), start—ount);
		replacement(createArray(), start—ount);
		replacementWithStep(createArray(), start—ount);
		foundMin(createArray(), start—ount);
		foundMax(createArray(), start—ount);
		increasing(createArray());
		valueHalfSum(createArray());
		moveToStep(createArray());

	}

	// Method Create Array
	public static int[] createArray() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		return array;
	}

	// 1
	public static void printOrder(int[] array, int limit) {
		System.out.println("In direct order :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
		System.out.println("In reverse order :");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}

	// 2
	public static void multiplyAll(int[] array, int forMultipied) {
		for (int i = 0; i < array.length; i++) {
			forMultipied = forMultipied * array[i];
			forMultipied++;
		}
		System.out.println("Total = " + forMultipied);
	}

	// 3
	public static void multiplyByTwo(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = array[i] * 2;
			}
			System.out.println("Mass after multipied = " + array[i]);
		}
	}

	// 4
	public static void chekForNumberElementWithZero(int[] array, int count) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.println("Element under the number " + i + " equals zero");
				count++;
			}
		}
		if (count == 0)
			System.out.println("No zero elements");

	}

	// 5
	public static void checkForZeroElementCount(int[] array, int count) {
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

	// 6

	public static void replacement(int[] array, int start—ount) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0 && i < array.length - 1) {
				int hollow;
				hollow = array[i];
				array[i] = array[i + 1];
				array[i + 1] = hollow;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("New array = " + array[i] + " ");
		}
	}

	// 7
	public static void replacementWithStep(int[] array, int start—ount) {
		for (int i = 0; i < array.length / 2; i++) {
			int hollow;
			hollow = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = hollow;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " = " + array[i]);
		}
	}

	// 8

	public static void foundMin(int[] array, int start—ount) {
		int index_min = start—ount;
		int min = array[start—ount];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Min value in this array = " + min);

	}

	// 9

	public static void foundMax(int[] array, int start—ount) {
		int index_max = start—ount;
		int max = array[start—ount];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Min value in this array = " + max);

	}

	// 10
	public static void increasing(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= array[i + 1]) {
				System.out.println("Not increasing");
				break;
			}
			if (i == array.length - 1) {
				System.out.println("Is increasing");
			}
		}

	}// 11

	public static void valueHalfSum(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			array[i] = (array[i - 1] + array[i + 1]) / 2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("π " + i + " =" + array[i]);
		}
	}

	// 12 Move all elements
	public static void moveToStep(int[] array) {
		for (int i = 0; i < array.length - 2; i++) {
			array[i] = array[i + 2];
			System.out.println(array[i]);
		}
	}
}