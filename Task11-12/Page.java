package HomeWork11_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Page {

	private float id;
	private String title;

	public Page() {

	}

	public Page(float id, String title) {
		this.id = id;
		this.title = title;
	}

	private List<Button> listOfButtons = new ArrayList<Button>();
	private List<Field> listOfField = new LinkedList<Field>();
	private Set<Label> listOfLabel = new HashSet<Label>();
	private Map<String, Dropdown> listOfDropdown = new HashMap<String, Dropdown>();

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public List<Button> getListOfButtons() {
		return listOfButtons;
	}

	public void setListOfButtons(List<Button> listOfButtons) {
		this.listOfButtons = listOfButtons;
	}


	// Button
	public void addButton(Button button) {
		listOfButtons.add(button);
	}

	public void deleteButton(Button button) {
		listOfButtons.remove(button);
	}

	public void replaceButton(int numberOfElement, Button button) {
		listOfButtons.set(numberOfElement, button);
	}

	public void printAllElementsListOfButton() {
		for (Button button : listOfButtons) {
			System.out.println("Name : " + button.getName() + "."+ " Action : " + button.getAction());
		}
	}

	// Field
	public void addField(Field field) {
		listOfField.add(field);
	}

	public void deleteField(Field field) {
		listOfField.remove(field);
	}

	public void replaceField(int numberOfElement, Field field) {
		listOfField.set(numberOfElement, field);
	}

	public void printAllElementsListOfField() {
		for (Field field : listOfField) {
			System.out.println("Id : " + field.getId() + "Value : " + field.getValue());
		}
	}

	// Label
	public void addLable(Label label) {
		listOfLabel.add(label);
	}

	public void deleteLable(Label label) {
		listOfLabel.remove(label);
	}

	public void replaceLable(Label oldlabel, Label newlabel) {
		listOfLabel.remove(oldlabel);
		listOfLabel.add(newlabel);
	}

	public void printAllElementsListOfLable() {
		for (Label label : listOfLabel) {
			System.out.println("Label : " + label.getName());
		}
	}

	// Dropdown

	public void addDropdown(String key, Dropdown dropdown) {
		listOfDropdown.put(key, dropdown);
	}

	public void deleteDropdown(String key, Dropdown dropdown) {
		listOfDropdown.remove(key, dropdown);
	}

	public void replaceDropdown(String key, Dropdown oldDropDown, Dropdown newDropDown) {
		listOfDropdown.replace(key, oldDropDown, newDropDown);
	}

	public void printAllElementsListOfDropdown() {
		Set<Map.Entry<String, Dropdown>> set = listOfDropdown.entrySet();
		for (Map.Entry<String, Dropdown> m : set) {
			System.out.println("All list : ");
			System.out.println("Key : " + m.getKey() + " Counrty : " + m.getValue().getList());
		}
	}
}
