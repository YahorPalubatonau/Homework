package HomeWork9;

public class Sirius extends Star {
	
	private static final int Pi = 0;
	int radius;
	int period;
	double age;
	String nameOfType;
	
	public Sirius() {
		
	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getNameOfType() {
		return nameOfType;
	}

	public void setNameOfType(String nameOfType) {
		this.nameOfType = nameOfType;
	}



	
	
	public double toLive() {
		double midleLive = 4.5 ;
		return age - midleLive;
	}

	public int resultMas() {
		int power = 2;
		double newton =9.8;
		int leadToLength = 4*Pi;
		return (int)(leadToLength*Math.pow(radius, power)/newton*(Math.pow(period, power)));
	}

	public String getNameInfo() {
		return super.getNameInfo() + " Type" + nameOfType + " .";
	}

	public String getMathInfo() {
		return super.getMathInfo() + " Age : " + age + " .";
	}
}