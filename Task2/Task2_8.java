package HomeWork2;

public class Task2_8 {
	public static void main(String[] args) {
		//int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 967, 78, 89, 8, 34, 768 };
		int x = 0;
		int size = 10;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}
		double min = array[x];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Min value in this array = " + min);

		int y = 0;
		double max = array[y];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				}
		}

		System.out.println("Max value in this array = " + max);
	}

}

//		int[] array = { 10, 2, 3, 1, 5, 6, -7, 8, 9, 67, 78, 89, 8, -34, 768 };
//		for (int i = 1; i < array.length; i++) {
//			if (array[min] < array[i] ) {
//			} else {
//				array[min] = array[i];
//			}
//		}
//		int i = 0;
//		System.out.println("Minimal element = " + array[i]);
//		int max = array.length-1;
//		if (array[max] > array[i] ) {
//		} else {
//			array[max] = array[i];
//		}
//	int e = array.length-1;
//	System.out.println("Maximum element = " + array[e]);
//}
//}
//
//public class Task2_8 {
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 67, 78, 89, 8, -34, 768 };
//		for (int i = array.length - 1; i > 0; i--) {
//			for (int min = 0; min < i; min++) {
//				if (array[min] > array[min + 1]) {
//					int new_laste = array[min];
//					array[min] = array[min + 1];
//					array[min + 1] = new_laste;
//				}
//			}
//		}
//		System.out.println(array[0]);
//		System.out.println(array[array.length - 1]);
//	}
//}
