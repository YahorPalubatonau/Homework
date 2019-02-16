package HomeWork11_12;


import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	public static void bubble(List<Button> list) {

		for (int i = 1; i < list.size(); i++) {
			for (int j = i; (j >= 1) && (list.get(j).getName().length() < list.get(j - 1).getName().length()); j--) {
				Button a = list.get(j);
				list.set(j, list.get(j - 1));
				list.set(j - 1, a);
			}
		}
		for (Button set : list) {
			System.out.println(set.getName());
		}
	}
}
