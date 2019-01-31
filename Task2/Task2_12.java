package HomeWork2;

public class Task2_12 {
	public static void main(String[] args) {
		// double[] array = {1.11, 0.0, 65.76, 87,65, 65,87, 0.0, 0.0, 43.67};
		int size = 10;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}
		for (int i = 0; i < array.length - 2; i++) {
			array[i] = array[i + 2];
			System.out.println(array[i]);
		}
	}
}
