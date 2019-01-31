package HomeWork2;

public class Task2_9 {
	public static void main(String[] args) {
		int x = 0;
		int size = 10;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}
		int index_min = x;
		double min = array[x];   
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index_min = i;
			}
			
			
			
		}
		//System.out.println(min);
		System.out.println("Minimum number with in index "+index_min);

		int y = 0;
		double max = array[y];
		int index_max = y;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				index_max = i;
			}
		}
		//System.out.println(max);
		System.out.println("Maximum number wihh in index "+index_max);
	}
}
