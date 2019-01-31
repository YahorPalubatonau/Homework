package HomeWork2;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2_1_2 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (int element : list) {
			System.out.println(element + 1);
		}

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}

		list.clear();
	}
}
