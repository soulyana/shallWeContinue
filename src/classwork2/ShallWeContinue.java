package classwork2;

import java.util.Scanner;

public class ShallWeContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String PROMPT = "Would you like to continue?";
		String input; 

		do {
			System.out.println(PROMPT);
			input = scan.nextLine(); 
			
			if (!input.equalsIgnoreCase("n") && !input.equalsIgnoreCase("y")) {
				System.out.println("Invalid entry. Please enter 'y' or 'n' only!");
			}
			
		} while (input.equalsIgnoreCase("y") || !input.equalsIgnoreCase("n"));
	}
}
