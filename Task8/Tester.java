package HomeWork8;

public class Tester {

	private String name;
	String surname;
	protected int expirienceInYears;
	public String englishLevel;
	double salary;

	// Constructor

	private Tester() {

	}

	// Through the method we create an object bypassing the constraints of the constructor.
	public static Tester create() {
		return new Tester();
	}

	private Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	private Tester(String name, String surname, int expirienceInYears, String englishLevel) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
		this(name, surname, expirienceInYears, englishLevel);
		this.salary = salary;
	}

	// Getters&Setters

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	// Methods

	double salaryTo2() {
		return salary * 2;
	}

	int expirienceInMonths() {
		return expirienceInYears * 12;
	}

	protected String nameSurname() {
		String info = "Name : " + name + "; " + "Surname : " + surname + "; ";
		return info;
	}

	public String allInfo() {
		String info = "Name : " + name + "; " + "Surname : " + surname + "; " + "Expensive : " + expirienceInYears
				+ "; " + "English Level : " + englishLevel + "; " + "Salary : " + salary + ".";
		return info;
	}
}
