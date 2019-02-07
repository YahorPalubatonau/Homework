package HomeWork9;

public class Earth extends Planet {

	double newGeneration;
	double oldGeneration;
	double population;
	String nameOfSatellites;

	public Earth() {
		super(nameOfGalaxy, planetColor, sizeOfPlanet);
	}

	public Earth(double newGeneration, double oldGeneration) {
		super(nameOfGalaxy, planetColor, sizeOfPlanet);
		this.newGeneration = newGeneration;
		this.oldGeneration = oldGeneration;
	}

	public Earth(double population) {
		super(nameOfGalaxy, planetColor, sizeOfPlanet);
		this.population = population;
	}

	public Earth(String nameOfSatellites) {
		super(nameOfGalaxy, planetColor, sizeOfPlanet);
		this.nameOfSatellites = nameOfSatellites;

	}

	public boolean moreYoung() {
		if(newGeneration > oldGeneration) {
			return true;
		}
		return false;
	}

	public double diff(double newGeneration, double oldGeneration) {
		return oldGeneration - newGeneration;
	}

	@Override
	public String getNameInfo() {
		return super.getNameInfo() + " Satellites" + nameOfSatellites + " .";
	}

	@Override
	public String getMathInfo() {
		return super.getMathInfo() + " Population : " + population + " .";
	}
	
	
}
