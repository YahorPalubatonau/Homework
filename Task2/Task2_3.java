package HomeWork2;

public class Task2_3 {

	public static void main(String[] args) {
		int size = 10;
		double[] array = new double[size];
		// Way ¹1
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}
		System.out.println("Way ¹1");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = array[i] * 2;
			}
			System.out.println(array[i]);
		}
		System.out.println("Way ¹2");
		// Way ¹2
		for (int i_2 = 0; i_2 < array.length; i_2++) {
			array[i_2] = Math.random() * 100;
		}
		for (int i_2 = 0; i_2 < array.length; i_2 += 2) {
			array[i_2] = array[i_2] * 2;
		}
		for (int i_2 = 0; i_2 < array.length; i_2++) {
			System.out.println(array[i_2]);
		}
	}
}