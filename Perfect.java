/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int divisor = Integer.parseInt(args[0]);
		perfectChecker(divisor);
	}
	public static void perfectChecker(int num){
		int numToCheck = 1;
		String isPerfect = num + " is a perfect number since " + num + " = 1";
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				isPerfect += " + "+ i ;
				numToCheck += i;
			}
		}
		if (numToCheck==num){
			System.out.println(isPerfect);
		}
		else{
			System.out.println(num + " is not a perfect number");
		}
	}
}
