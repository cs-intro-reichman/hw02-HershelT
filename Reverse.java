import java.util.Arrays;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String input = args[0];
		reverse(input);
	}
	public static void reverse(String input){
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println(reversed);
		System.out.println("The middle character is "+input.charAt((input.length()-1)/2));
	}

}
