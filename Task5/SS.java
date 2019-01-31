package HomeWork5;

public class SS {
	public static void main(String[] args) {
		// Shell Sort

		int[] theArray = { 44, 5, 33, 22, 765, 43, 53, 12, 57, 97 };

		// first section gets the Knuth's interval sequence (very efficient)
		int h = 1;
		while (h <= theArray.length / 3) {
			h = 3 * h + 1; // h is equal to highest sequence of h<=length/3 (1,4,13,40...)
		}

		// next section
		while (h > 0) { // for array of length 10, h=4

			// similar to insertion sort below
			for (int i = 0; i < theArray.length; i++) {

				int temp = theArray[i];
				int j;

				for (j = i; j > h - 1 && theArray[j - h] >= temp; j = j - h) {
					theArray[j] = theArray[j - h];
				}
				theArray[j] = temp;
			}
			h = (h - 1) / 3;
		}
		for (int i = 0; i < theArray.length; i++) {
			System.out.print(theArray[i] + " ");
		}
	}
}
