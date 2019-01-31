package HomeWork2;

public class Task2_1_1 {
	public static void main(String[] args) {
		int array2_1[][] = { { 10, 2, 3, }, { 1, 5, 6, }, { -7, 8, 967 }, };
		System.out.println("In direct order");
		for (int i = 0; i < array2_1.length; i++) {
			for (int j = 0; j < array2_1[i].length; j++) {
				System.out.print(array2_1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("In reverse order");
		for (int i = array2_1.length - 1; i >= 0; i--) {
			for (int j = array2_1[i].length - 1; j >= 0; j--) {
				System.out.print(array2_1[i][j] + " ");
			}
			System.out.println();
		}

		int x = 0;
		int y = 0;
		int min = array2_1[x][y];
		int index_mini = x;
		int index_minj = y;

		for (int i = 0; i < array2_1.length; i++) {
			for (int j = 0; j < array2_1[i].length; j++) {
				if (min > array2_1[i][j]) {
					min = array2_1[i][j];
					index_mini = i;
					index_minj = j;
				}
			}
		}
		System.out.println("Display min:");
		System.out.print(" In line :  " + index_mini + "  in row :" + index_minj + " minimal value=" + min);
		System.out.println();

		int w = 0;
		int z = 0;
		int max = array2_1[w][z];
		int index_maxi = w;
		int index_maxj = z;
		for (int i_2 = 0; i_2 < array2_1.length; i_2++) {
			for (int j_2 = 0; j_2 < array2_1[i_2].length; j_2++) {
				if (max < array2_1[i_2][j_2]) {
					max = array2_1[i_2][j_2];
					index_maxi = i_2;
					index_maxj = j_2;
				}
			}
		}

		System.out.println("Display max:");
		System.out.print(" In line   " + index_maxi + "  in row :" + index_maxj + "  maximal value=" + max);
		System.out.println();

	}
}
