package HomeWork8;

public class CheckTester {

	public static void main(String[] args) {

		Tester tester = new Tester("Egor", "Polubatonov", 6, "A1", 216.90);

		//System.out.println(tester.salaryTo2());  Available only in its class
		System.out.println(tester.expirienceInMonths());
		System.out.println(tester.nameSurname());
		System.out.println(tester.allInfo());
		
		Tester charlesBronson = Tester.create();
		
		charlesBronson.setName("Charles");
		charlesBronson.setSurname("Bronson");
		charlesBronson.setExpirienceInYears(34);
		charlesBronson.setEnglishLevel("B7");
		charlesBronson.setSalary(34.78);
		
		//System.out.println(charlesBronson.salaryTo2());  Available only in its class
		System.out.println(charlesBronson.expirienceInMonths());
		System.out.println(charlesBronson.nameSurname());
		System.out.println(charlesBronson.allInfo());

	}
}
