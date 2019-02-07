package HomeWork9;

public class Check {

	public static void main(String[] args) {

		Planet planet = new Planet(5789, 76, "Zeta", "Blue", 136.67);
		System.out.println(planet.getNameInfo());
		System.out.println(planet.getMathInfo());
		System.out.println(" Distance : " + planet.lightYears() + " light years");
		planet.printPlanetOrStar();
		System.out.println("Hash codE : " + planet.hashCode());
		System.out.println("Representation of object : "+ planet.toString());
		

		Star star = new Star(8, 1243, "Rettys", "Yellow", 678.09);
		System.out.println(star.getNameInfo());
		System.out.println(star.getMathInfo());
		System.out.println(" Distance : " + star.lightYears() + " light years");
		
		star.printPlanetOrStar();

		
		Mars mars = new Mars(12.34232);
		Mars mars1 = new Mars("Pupyn");
		Mars mars2 = new Mars(56.35345 , 43.45343);
		mars1.getNameInfo();
		mars.getMathInfo();
		mars2.diff();
		mars2.moreYoung();
		
		System.out.println(star.hashCode());
		System.out.println(star.toString());
		
		Sun sun = new Sun();
		sun.setRadius(45667);
		sun.setPeriod(6);
		System.out.println(sun.getNameInfo());
		System.out.println(sun.getMathInfo());
		System.out.println("Result = " + sun.resultMas());
		
		StarSystem starSystem;
		starSystem = new Earth();	
		System.out.println(starSystem.getMathInfo());
		starSystem = new Star();
		System.out.println(starSystem.getMathInfo());
		
		Sirius sirius = new Sirius();
		sirius.setAge(2.3);
	}
}
