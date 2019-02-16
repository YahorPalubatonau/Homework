package HomeWork11_12;

import java.util.TreeSet;

public class MainMenu {
	public static void main(String[] args) {

		Page page = new Page(2.4f, "HomePage");

		Button button = new Button("Up", "Start page");
		Button button1 = new Button("Down", "End page");
		Button button2 = new Button("Return", "Old page");
		Button button3 = new Button("Add", "New page");

		page.addButton(button1);
		page.addButton(button2);
		page.addButton(button3);

		page.printAllElementsListOfButton();
		page.replaceButton(1, button);
		page.printAllElementsListOfButton();
		page.addButton(button2);
		page.addButton(new Button("I", ""));
		Field field = new Field(12.34f, 45);
		Field field1 = new Field(17.4f, 55);
		Field field2 = new Field(19.37f, 65);
		Field field3 = new Field(23.11f, 85);

		page.addField(field1);
		page.addField(field2);
		page.addField(field3);

		page.printAllElementsListOfField();
		page.replaceField(0, field);
		page.printAllElementsListOfField();

		Label label = new Label("Red");
		Label label1 = new Label("Blue");
		Label label2 = new Label("Grey");
		Label label3 = new Label("Green");
		Label label4 = new Label("Red");
		System.out.println(label4.equals(label1));
		page.addLable(label);
		page.addLable(label);
		page.addLable(label1);
		page.addLable(label2);
		page.addLable(label3);
		page.printAllElementsListOfLable();
		page.replaceLable(label1, label4);
		page.printAllElementsListOfLable();

		Dropdown dropdown = new Dropdown("Dropdown of Coutnries", "USA", "Belarus", "Germany", false);
		Dropdown dropdown1 = new Dropdown("Dropdown of Cities", "Washington", "Zabludishki", "Berlin", true);

		page.addDropdown("Country", dropdown);
		page.printAllElementsListOfDropdown();
		page.replaceDropdown("Country", dropdown, dropdown1);
		page.printAllElementsListOfDropdown();

		TreeSet<Label> treeSet = new TreeSet<Label>();
		treeSet.add(label3);
		treeSet.add(label2);
		treeSet.add(label4);

		for (Label set : treeSet) {
			System.out.println(set.getName());
		}
		treeSet.remove(label3);
		treeSet.add(label);
		for (Label set : treeSet) {
			System.out.println(set.getName());
		}

		// Bubble
		page.getListOfButtons();
		BubbleSort.bubble(page.getListOfButtons());

	}
}
