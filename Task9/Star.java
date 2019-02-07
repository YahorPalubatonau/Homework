package HomeWork9;

public class Star extends StarSystem{

	int brightness;
	int parsec;
	String nameOfGalaxy;
	String starColor;
	double sizeOfStar;
	
	Star(){
		
	}

	public Star(String nameOfGalaxy, String starColor) {
		this.starColor = starColor;
		this.nameOfGalaxy = nameOfGalaxy;
	}

	public Star(String nameOfGalaxy, String starColor, double sizeOfStar) {
		this(nameOfGalaxy, starColor);
		this.sizeOfStar = sizeOfStar;
	}
	
	public Star(int brightness ,int parsec,String nameOfGalaxy , String starColor, double sizeOfStar) {
		this(nameOfGalaxy, starColor,sizeOfStar);
		this.brightness = brightness;
		this.parsec = parsec;
	}
	
	public void printPlanetOrStar(){
		if(brightness <=0) {
			System.out.println("This is a Planet !!!");
		}
		else {
			System.out.println("This is a star !!!");
		}
			
	}
	
	public double lightYears() {
		return (double)parsec*3.26;
	}
	

	@Override
	public String getNameInfo() {
		String title = "Galaxy : " + nameOfGalaxy + " have got a star with " + starColor + " color .";
		return title;
	}

	@Override
	public String getMathInfo() {
		String title = "Size : " + sizeOfStar ;
		return title;
	}
	

}
