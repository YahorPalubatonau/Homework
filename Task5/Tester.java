package HomeWork5;

public class Tester {

	static String name;
	static String surname;
	static int expirienceInYears;
	static String englishLevel;
	static double salary;

	public Tester() {

	}

	public Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
		this(name, surname, expirienceInYears, englishLevel);
		this.salary = salary;
	}

	public int printInfo(int expirienceInYears) {
		return expirienceInYears;
	}

	public String printInfo(String name, String surname) {
		String info = "Name : " + name + "; " + "Surname : " + surname + ".";
		return info;
	}

	public String printInfo(String name, String surname, String englishLevel) {
		String info = "Name : " + name + "; " + "Surname : " + surname + "; " + "English level : " + expirienceInYears
				+ ".";
		return info;
	}

	static String printALlInfo() {
		String info = "Name : " + name + "; " + "Surname : " + surname + "; " + "Expensive : " + expirienceInYears
				+ "; " + "English Level : " + englishLevel + "; " + "Salary : " + salary + ".";
		return info;
	}

}
