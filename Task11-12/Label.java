package HomeWork11_12;

public class Label implements Comparable<Object> {

	private String name;

	public Label() {

	}

	public Label(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		Label lable = (Label) obj;

		if (null == name) {
			return (name == lable.name);
		} else {
			if (!name.equals(lable.name)) {
				return false;
			}
			return true;
		}

	}

	public int hashCode() {

		return (int) (17 + ((null == name) ? 0 : name.hashCode()));

	}

	@Override
	public int compareTo(Object args) {
		Label label = (Label) args;

		if (this.equals(label)) {
			return 0;
		}
		int result = this.name.length() - label.name.length();
		if (result != 0) {
			return result / Math.abs(result);
		}

		return 0;
	}

}
