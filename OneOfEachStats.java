import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		stats(T, generator);
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
	public static void stats(int times, Random seed){
		double averageChildren = 0;
		int FamiliesWithTwo = 0;
		int FamiliesWithThree = 0;
		int familiesWithFourOrMore = 0;
		double totalChildren = 0;
		for (int i = 0; i < times; i++) {
			double numOfBoys = 0;
			double numOFGirls = 0;
			while (numOfBoys == 0 || numOFGirls == 0) {
				double rnd = seed.nextDouble();
				if (rnd < 0.5) {
					numOfBoys++;
				}
				else{
					numOFGirls++;
				}
				totalChildren++;
			}
			if (numOfBoys + numOFGirls == 2) {
				FamiliesWithTwo++;
			}
			else if (numOfBoys + numOFGirls == 3) {
				FamiliesWithThree++;
			}
			else if (numOfBoys + numOFGirls >= 4) {
				familiesWithFourOrMore++;
			}
		}
		averageChildren = totalChildren / times;
		String mostCommonAmountOfChildren = "The most common number of children is ";
		if (FamiliesWithTwo > FamiliesWithThree && FamiliesWithTwo > familiesWithFourOrMore) {
			mostCommonAmountOfChildren += 2 + ".";
		}
		else if (FamiliesWithThree > FamiliesWithTwo && FamiliesWithThree > familiesWithFourOrMore) {
			mostCommonAmountOfChildren += 3 + ".";
		}
		else if (familiesWithFourOrMore > FamiliesWithTwo && familiesWithFourOrMore > FamiliesWithThree) {
			mostCommonAmountOfChildren += 4 + " or more.";
		}
		System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + FamiliesWithTwo);
		System.out.println("Number of families with 3 children: " + FamiliesWithThree);
		System.out.println("Number of families with 4 or more children: " + familiesWithFourOrMore);
		System.out.println(mostCommonAmountOfChildren);
	}
}
