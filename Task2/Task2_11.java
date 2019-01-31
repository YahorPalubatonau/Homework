package HomeWork2;

public class Task2_11 {
	public static void main(String[] args) {
		// double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 67, 78, 89, 8, -34, 768 };
		int size = 10;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}
		for (int i = 1; i < array.length - 1; i++) {
			array[i] = (array[i - 1] + array[i + 1]) / 2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("¹ " + i + " =" + array[i]);
		}
	}
}
