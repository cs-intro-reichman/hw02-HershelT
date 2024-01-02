/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		DamkaGenerater(4);
	}
	public static void DamkaGenerater(int num) {
		for (int i = 1; i <= num;i++){
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}
}
