package HomeWork2;

public class Task2_5 {
	public static void main(String[] args) {
		int size = 10;
		int count = 0;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
			if (array[i] == 0) {
				System.out.println("Element under the number " + i + " equals zero");
				count++;
			}
		}
		if (count == 0)
			System.out.println("No zero elements");

	}
}
