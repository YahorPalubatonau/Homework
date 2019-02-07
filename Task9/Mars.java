package HomeWork9;

public class Mars extends Planet{
	
	double newGeneration;
	double oldGeneration;
	double population;
	String nameOfSatellites;

	public Mars() {
		super(nameOfGalaxy, planetColor, sizeOfPlanet);
		}

		public Mars(double newGeneration, double oldGeneration) {
			super(nameOfGalaxy, planetColor, sizeOfPlanet);
			this.newGeneration = newGeneration;
			this.oldGeneration = oldGeneration;
		}

		public Mars(double population) {
			super(nameOfGalaxy, planetColor, sizeOfPlanet);
			this.population = population;
		}

		public Mars(String nameOfSatellites) {
			super(nameOfGalaxy, planetColor, sizeOfPlanet);
			this.nameOfSatellites = nameOfSatellites;

		}

		public boolean moreYoung() {
			if(newGeneration > oldGeneration) {
				System.out.println("More young ? :" + true);
				return true;
			}
			System.out.println("More young ? :" + false);
			return false;
		}

		public double diff() {
			System.out.println("Difference : " + (oldGeneration - newGeneration));
			return oldGeneration - newGeneration;
		}

		@Override
		public String getNameInfo() {
			System.out.println(super.getNameInfo() + " Satellites" + nameOfSatellites + " .");
			return super.getNameInfo() + " Satellites" + nameOfSatellites + " .";
		}

		@Override
		public String getMathInfo() {
			System.out.println(super.getMathInfo() + " Population : " + population + " .");
			return super.getMathInfo() + " Population : " + population + " .";
		}
		
		
	}
