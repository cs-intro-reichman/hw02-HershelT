/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int start = 0;
		int end = 10;
		inOrder(start,end);
	}
	public static void inOrder(int begRange, int endRange){
		int num = (int) (Math.random()*(endRange-begRange+1)+begRange);
		int newNum = 0;
		while (newNum <= num) {
			System.out.print(num + " ");
			newNum = num;
			num = (int) (Math.random()*(endRange-begRange+1)+begRange);
		}
	}


//	public void
}
