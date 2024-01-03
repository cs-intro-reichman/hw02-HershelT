
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		oneOfEach();
	}
	public static void oneOfEach() {
		String children = "";
		int numOfBoys = 0;
		int numOFGirls = 0;
		while (numOfBoys == 0 || numOFGirls == 0) {
			double rnd = Math.random();
			if (rnd < 0.5) {
				children += "b";
				numOfBoys++;
			}
			else{
				children += "g";
				numOFGirls++;
			}
			children += " ";
		}
		System.out.println(children);
		System.out.println("You made it. . . and you now have " + numOFGirls+numOfBoys + " children.");
	}
}
