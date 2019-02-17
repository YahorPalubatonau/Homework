package HomeWork13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Massive {

	private int workingMonths;
	private int salary;
	private ArrayList<String> arrayList = new ArrayList<String>();
	private String[] name;
	private int mySalary;

	public Massive() {

	}

	public Massive(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}

	public Massive(int salary, int workingMonths) {
		this.salary = salary;
		this.workingMonths = workingMonths;
	}

	public int calculateSalary(int salary, int workingMonths, int positiveOrNegative) {
		try {
			Character.toChars(positiveOrNegative);
			mySalary = salary / workingMonths;
			System.out.println("Salary : " + mySalary);
		} catch (IllegalArgumentException ex1) {
			System.out.println("Exceptional value : " + ex1.getMessage());
		} catch (ArithmeticException ex) {
			System.out.println("It is impossible to divide by zero.");
		}
		return mySalary;
	}

	public void printName(String[] name, int size, int divider) {
		try {
			System.out.println(name[size]);
			System.out.println(name.length / divider);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("Exception : " + ex.getMessage());
		}
	}

	public void searchExceptions(ArrayList<String> arrayList) {
		try {
			arrayList.size();
			System.out.println(arrayList.toString());
		} catch (NullPointerException ex) {
			System.out.println("Exception was processed. Program continues :" + ex.getMessage());
		}
	}

	public void finallySearchExceptions(ArrayList<String> arrayList) {
		try {
			arrayList.size();
		} catch (NullPointerException ex) {
			System.out.println("Exception was processed. Program continues :" + ex.getMessage());
		} finally {
			System.out.println("Always working.");
		}

	}

	public void tryInTrySearchExceptions(ArrayList<String> arrayList, int divider) {
		try {
			arrayList.toString();
			try {
				System.out.println(arrayList.size() / divider);
			} catch (ArithmeticException ex) {
				System.out.println("Exception was processed. Program continues :" + ex.getMessage());
			}
		} catch (NullPointerException ex) {
			System.out.println("Exception was processed. Program continues :" + ex.getMessage());
		}
	}

	public void neverFinally() {
		try {
			System.out.println("Try.");
			System.exit(0);
		} catch (Exception ex) {
			System.out.println("Exception : " + ex.getMessage());
		} finally {
			System.out.println("Finally.");
		}
	}

	public void tryWithResources() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\MyAdorableStudy.txt"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
