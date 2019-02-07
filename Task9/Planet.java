package HomeWork9;

public class Planet extends StarSystem {
	
    int brightness = 0;
    int parsec;
	static String nameOfGalaxy;
	static String planetColor;
	static double sizeOfPlanet;

	public Planet(String nameOfPlanet, String planetColor) {
		this.planetColor = planetColor;
		this.nameOfGalaxy = nameOfPlanet;
	}

	public Planet(String nameOfGalaxy, String planetColor, double sizeOfPlanet) {
		this(nameOfGalaxy, planetColor);
		this.sizeOfPlanet = sizeOfPlanet;
	}
	
	public Planet(int brightness ,int parsec,String nameOfGalaxy, String planetColor, double sizeOfPlanet) {
		this(nameOfGalaxy, planetColor,sizeOfPlanet);
		this.parsec = parsec;
	}
	
	public void printPlanetOrStar(){
		if(brightness <=0) {
			System.out.println("This is a Planet !!!");
		}
		if(brightness > 0) {
			System.out.println("This is a star !!!");
		}
			
	}
	
	public double lightYears() {
		return (double)parsec*3.26;
	}
	

	@Override
	public String getNameInfo() {
		String title = "Galaxy : " + nameOfGalaxy + " have got a planet with " + planetColor + " color .";
		System.out.println(title);
		return title;
	}

	@Override
	public String getMathInfo() {
		String title = "Size : " + sizeOfPlanet  ;
		return title;
	}
	public int hashCode() {
	
		return (int)(17*parsec + ((null == nameOfGalaxy) ? 0 : nameOfGalaxy.hashCode()) + ((null == planetColor) ? 0 : planetColor.hashCode()));
		
	}
	
	public String toString() {
		return getClass().getName()+ "@"+ "Size : " + sizeOfPlanet  + "Galaxy : " + nameOfGalaxy + " have got a planet with " + planetColor + " color .";
	}

}
