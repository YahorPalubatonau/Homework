package HomeWork2;

public class MinMax {
	public static void main(String[] args) {
		int[] array = { 1, 1, 3, 4, 5, 6, 7, 8, 9, 67, 78, 89, 8, -34, 768 };
		
		// Min
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int min_index = i;
			for (int new_min = i + 1; new_min < array.length; new_min++) {
				if (array[new_min] < min) {
					min = array[new_min];
					min_index = new_min;
				}
			}
			if (i != min_index) {
				int least = array[i];
				array[i] = array[min_index];
				array[min_index] = least;
			}
			System.out.println("Minimal value = " + min);
			System.out.println("Minimal index = " + min_index);
		}
		
			
			// Max
			//int max = array[i];
			//int max_value = i;
			//for (int new_max = i + 1; new_max < array.length; new_max++) {
			//	if (array[new_max] > max) {
			//		max = array[new_max];
			//		max_value = new_max;
				//}
			//}
			//if (i != max_value) {
			//	int greatest = array[i];
			//	array[i] = array[max_value];
			//	array[max_value] = greatest;
			//}
			
			

		
		//System.out.println("Maximum value = " + max);
		//System.out.println("Maximum value = " + max_value);
		
		
	}
	

}
