package HomeWork11_12;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {

	private boolean isSelected;
	private String name;
	private List<String> list = new ArrayList<String>();

	public Dropdown() {

	}

	public Dropdown(String name, String country1, String country2, String country3, boolean isSelected) {
		this.isSelected = isSelected;
		this.list.add(country1);
		this.list.add(country2);
		this.list.add(country3);
		this.name = name;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null == obj) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Dropdown dropdown = (Dropdown) obj;

		if (null == name) {
			return (name == dropdown.name);
		} else {
			if (!name.equals(dropdown.name)) {
				return false;
			}
			return true;
		}

	}

	public int hashCode() {

		return (int) (17 + ((null == name) ? 0 : name.hashCode()));

	}

}
