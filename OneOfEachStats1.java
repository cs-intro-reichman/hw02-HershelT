/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */

public class OneOfEachStats1{
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		stats(T);
	}
	public static void stats(int times){
		double averageChildren = 0;
		int FamiliesWithTwo = 0;
		int FamiliesWithThree = 0;
		int familiesWithFourOrMore = 0;
		double totalChildren = 0;
		for (int i = 0; i < times; i++) {
			double numOfBoys = 0;
			double numOFGirls = 0;
			while (numOfBoys == 0 || numOFGirls == 0) {
				double rnd = Math.random();
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
