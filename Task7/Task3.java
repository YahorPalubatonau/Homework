package HomeWork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {

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

		List<String> listOfString = Arrays.asList(array);
		List<String> newListOfString = new ArrayList<String>();
		newListOfString.addAll(listOfString);
		List<Integer> listOfInteger = new ArrayList<Integer>();

		for (int i = 0; i < newListOfString.size(); i++) {
			listOfInteger.add(newListOfString.get(i).length());
		}
		int result = resultAverageValue(listOfInteger);
		System.out.println("AverageValue = " + result);

		for (int i = 0; i < newListOfString.size(); i++) {
			if (newListOfString.get(i).length() < result) {
				System.out.println("String shorter = " + newListOfString.get(i) + "( Lenght = "
						+ newListOfString.get(i).length() + " )" + ".");
			}
			if (newListOfString.get(i).length() > result) {
				System.out.println("String longer = " + newListOfString.get(i) + "( Lenght = "
						+ newListOfString.get(i).length() + " )" + ".");
			}
		}
	}

	public static int resultAverageValue(List<Integer> listOfInteger) {
		int sum = 0;
		for (int i = 0; i < listOfInteger.size(); i++) {
			sum = sum + listOfInteger.get(i);
		}
		return Math.round((float) sum / (float) listOfInteger.size());

	}
}
