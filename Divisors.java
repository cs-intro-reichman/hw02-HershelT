/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		//get command line argument int
		int divisor = Integer.parseInt(args[0]);
		getDivisors(divisor);
	}
	public static void getDivisors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
