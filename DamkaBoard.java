/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		DamkaGenerater(6);
	}
	public static void DamkaGenerater(int num) {
		for (int i = 0; i < num;i++){
			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}
}
