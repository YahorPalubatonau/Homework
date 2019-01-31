package HomeWork4;

public class CallMethods {
	public static void main(String[]args) {
		
		Person person1 = new Person("Pedro" , "Alvares" , 44 , 6758899);
		Person person2 = new Person();
		
		person1.printAllInformation();
		
		person2.setName("Erica");
		person2.setSurName("Hugo");
		person2.setAge(12);
		person2.setPhone(4567890);
		person2.printAllInformation();
		
		System.out.println("True or not : " + person1.itAdult());
		System.out.println("True or not : " + person2.itAdult());
		
	}

}
