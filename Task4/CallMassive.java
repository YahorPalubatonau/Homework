package HomeWork4;

import java.util.Scanner;

public class CallMassive {
	public static void main(String[] args) {
		
		Massive massive = new Massive();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			int leadsToTen = 10;
			array[i] = (int) (Math.random() * leadsToTen);
		}
		
		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
		massive.getSumOfElements(array);
		massive.printMassiveAsLine(massive.multiptyBy3(array));
		massive.printReverseMassiveAsLine(array);
		
	}
	

}
