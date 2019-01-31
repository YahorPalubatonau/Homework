package HomeWork2;

public class Task2_6 {
	public static void main(String[] args) {
		 int size = 7;
		 double[] array = new double[size];
		 for (int i = 0; i < array.length; i++) {
		 array[i] = Math.random() * 10;
		 }
		 //double[] array = { 1.11, 0.4, 69.76, 0.0, 44.56, 65.95, 12.67, 87.89, 8.04, 0.0, 43.67 };
		 //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 67, 78, 89, 8, -34, 768};
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0 && i < array.length - 1) {
				double hollow;
				hollow = array[i];
				array[i] = array[i + 1];
				array[i + 1] = hollow;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}

	}
}
