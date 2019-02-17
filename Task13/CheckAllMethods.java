package HomeWork13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CheckAllMethods {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("notes3.txt", false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Five");
		list.add(null);
		
		ArrayList<String> list2 = null;
		
		String[] name = { "Egor", "Ivan" };
				
		Massive massive = new Massive();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\MyAdorableStudy.txt"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		massive.calculateSalary(867, 12,1);
		massive.calculateSalary(86, -8,-1);
		massive.calculateSalary(0,0,1);
		massive.printName(name,2,4);
		massive.printName(name,7,6);
		massive.printName(name,0,0);
		massive.searchExceptions(list);
		massive.searchExceptions(list2);
		massive.finallySearchExceptions(list);
		massive.finallySearchExceptions(list2);
		massive.tryInTrySearchExceptions(list,0);
		massive.tryInTrySearchExceptions(list2,9);
		
		massive.tryWithResources();
		
		massive.neverFinally();
		
	}

}
