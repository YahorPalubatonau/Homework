package HomeWork2;

public class Task2_7 {

	public static void main(String[] args) {
		//int size = 11;
		//double[] array = new double[size];
		//for (int i = 0; i < array.length; i++) {
		//	array[i] = Math.random() * 10;
		//}
		double[] array = {1.11, 0.4, 69.76, 0.0, 44.56, 65.95, 12.67, 87.89, 8.04, 0.0, 43.67};
		for (int i = 0; i <array.length/2; i++) {
			double hollow;
			hollow = array[i];
			array[i] = array[(array.length-1) - i];
			array[(array.length-1) - i] = hollow;
		}
		for (int i = 0; i < array.length; i++) {
		System.out.println("Element " +i+ " = "+array[i]);
		}
	}
}