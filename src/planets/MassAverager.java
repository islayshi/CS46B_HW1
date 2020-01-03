package planets;

public class MassAverager 
{
	// Complete this. Retrieve the array of planets, then compute average mass.
	public float getMeanPlanetaryMass()
	{
		float average = 0;
		Planet[] system = Planet.getAll();
		
		//adding all the planets masses together, storing into average
		for(int i = 0; i < system.length; i++) {
			average = average + system[i].getMass();			
		}
		
		//divide the sum of the planet's masses by the number of masses
		average = average / system.length;
		
		return average;
	}
	
	
	//
	// In almost all classes in almost all 46B homework assignments, the main()
	// method is for you to test your code. The autograder doesn't look at the
	// output from main().
	//
	// Since this assignment is simple, there's really only 1 useful version of
	// main(), and it's provided here. Later, when your assignments are more
	// complicated, your main() will change several or many times as you develop
	// different pieces of your assignment.
	public static void main(String[] args)
	{
		MassAverager averager = new MassAverager();
		System.out.println(averager.getMeanPlanetaryMass());
	}
}
