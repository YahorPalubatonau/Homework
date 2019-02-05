package HomeWork8a;

import HomeWork8.Tester;

public class CheckTester2 {


	public static void main(String[] args) {

		Tester tester = new Tester("Kristina", "Orbacaite", 0, "A1-", 2322216.90);

		// System.out.println(tester.salaryTo2()); Available only in its class.
		// System.out.println(tester.expirienceInMonths()); Available to classes in the
		// same package.
		//System.out.println(tester.nameSurname()); //Available to classes in the same
		// package
		// and subclasses in other packages.At creation of the successor will be
		// fulfilled.
		System.out.println(tester.allInfo());
	}
}
