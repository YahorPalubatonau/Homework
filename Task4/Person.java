package HomeWork4;

public class Person {

	// Create class "Person"

	public String name;
	public String surname;
	public int age;
	public int phone;
	
	public Person() {
		
	}

	public Person(String name, String surname, int age, int phone) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
	}

	// set

	public void setName(String name) {
		this.name = name;
	}

	public void setSurName(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	// get

	public String getName() {
		return this.name;
	}

	public String getSurName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}

	// Methods

	public void printAllInformation() {
		System.out.println("Name : " + this.name + " ; " + "Surname : " + this.surname + " ; " + "Age : " + this.age + " ; "
				+ "Phone : " + this.phone + " ; ");
	}

	public void printName() {
		System.out.println("Name : " + this.name + " ; " + "Surname : " + this.surname + " ; ");

	}

	public boolean itAdult() {
		if (this.age > 18) {
			return true;
		} else {
			return false;
		}
		//or return this.age >= 18;
	}
}
