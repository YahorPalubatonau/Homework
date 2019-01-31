package HomeWork4;

public class Massive {

	public void printMassiveAsLine(int[] array) {
		System.out.println("In direct order :");
		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i]);
		System.out.println();
	}

	public void printReverseMassiveAsLine(int[] array) {
		System.out.println("In reverse order :");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(" " + array[i]);
		System.out.println();
	}

	public int getSumOfElements(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.print(" Total = " + sum);
		System.out.println();
		return sum;
	}

	public int[] multiptyBy3(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 3;
		}
		return array;

	}
}
