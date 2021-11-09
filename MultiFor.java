import java.util.Scanner;

public class MultiFor {

	public static void main(String[] args) {
		
		Scanner input_scanner = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int number_1 = input_scanner.nextInt();
		System.out.println("Enter the second number:");
		int number_2 = input_scanner.nextInt();
		
	       	for (int i = 1; i <= number_2; i++) {
	            System.out.println(number_1 + " * " + i + " = " + number_1 * i);
	        }
	}

}
