package HomeWork2;

public class Task2_10 {
	public static void main(String[] args) {
		int size = 10;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
			if (array[i] >= array[i + 1]) {
				System.out.println("Not increasing");
				break;
			}
			if (i == array.length - 1) {
				System.out.println("Is increasing");

			}
		}
	}
}
