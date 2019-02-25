package core;

import java.util.ArrayList;
import java.util.List;

public class Massive {

	private List<Integer> listOfIntegers = null;
	private List<String> listOfStings = new ArrayList<String>();

	public boolean emptyOrNot(List<String> listOfStings) {
		return listOfStings.isEmpty();
	}
	public ArrayList<String> addString(ArrayList<String> listOfStings, String newString) {
		listOfStings.add(newString);
		return listOfStings;
	}
	public String searchExceptions() {
		try {
			listOfIntegers.size();
			System.out.println(listOfIntegers.toString());
		} catch (NullPointerException ex) {
			System.out.println("Exception was processed. Program continues :" + ex.getMessage());
		}
		return "Exception";
	}
	public boolean containsNumber(List<String> listOfStings, String founder) {
		return listOfStings.contains(founder);
	}
	public List<Integer> replace(List<Integer> listOfIntegers, int index, int element) {
		listOfIntegers.set(index,element);
		return listOfIntegers;
	}
	
}
