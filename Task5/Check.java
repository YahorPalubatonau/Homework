package HomeWork5;

public class Check {
	public static void main(String[] args) {
		
		System.out.println(Tester.printALlInfo());

		new Tester("Ivan", "Pupkin", 56, "A2 +", 45.89);
		System.out.println(Tester.printALlInfo());

		new Tester("Egor", "Dudon", 23, "A1", 134.56);
		System.out.println(Tester.printALlInfo());
	}
}
