package HomeWork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {

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
		Collections.sort(listOfInteger);
		for (int i = 0; i < listOfInteger.size(); i++) {
			for (int j = 0; j < newListOfString.size(); j++)
				if (listOfInteger.get(i) == newListOfString.get(j).length()) {
					System.out.println(newListOfString.get(j));
					newListOfString.remove(j);
				}
		}
	}
}