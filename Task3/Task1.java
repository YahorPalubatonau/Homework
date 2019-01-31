package HomeWork3;

public class Task1 {

	public static void main(String[] args) {

//Find the minimum number of 2 numbers, return the minimum

		int leadsToIntegers = 10;
		int a = (int) (Math.random() * leadsToIntegers);
		int b = (int) (Math.random() * leadsToIntegers);
		System.out.println("Minimal number = " + printMin(a, b));
	}

	public static int printMin(int a, int b) {
		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
}
