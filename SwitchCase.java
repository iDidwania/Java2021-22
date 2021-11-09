import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner input_scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int number_1 = input_scanner.nextInt();
		
		System.out.println("Enter the second number:");
		int number_2 = input_scanner.nextInt();
		
		System.out.println("What would you like to do?");
		String operation = input_scanner.next();
		
		
		switch (operation) {
		case "+" : 
			int sum = number_1 + number_2;
			System.out.println("the sum is: " + sum);
			break;
			
		case "-" : 
			int subtraction = number_1 - number_2;
			System.out.println("the subtraction is: " + subtraction);
			break;
			
		case "*" : 
			int multiplication = number_1 * number_2;
			System.out.println("the multiplication is: " + multiplication);
			break;
			
		case "/" : 
			int division = number_1 / number_2;
			System.out.println("the division is: " + division);
			break;
			
		case "%" : 
			int remainder = number_1 % number_2;
			System.out.println("the remainder is: " + remainder);
			break;
		
		default:
			System.out.println("Not acceptable.");
		}
		
	}

}
