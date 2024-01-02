/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		DamkaGenerater(4);
	}
	public static void DamkaGenerater(int num) {
		for (int i = 0; i < num;i++){
			String isSpace = "";
			if (i % 2 == 1) {
				isSpace = (" *");
			}
			else{
				isSpace = "* ";
			}
			for (int j = 0; j < num; j++) {
				System.out.print(isSpace);
			}
			System.out.println();

		}

	}
}
