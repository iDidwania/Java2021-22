import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		
		// Creating the scanner.
		Scanner input_scanner = new Scanner(System.in);
		
		// Reading the input text.
		System.out.println("What is your name?");
		String name = input_scanner.next();
		System.out.println("Hello " + name + "! Nice to meet you.");
		
		// Reading the input integer.
		System.out.println("What is your Age?");
		int age = input_scanner.nextInt();
		if (age < 18) {
			System.out.println("OK. You are a minor because your age (" + age + ") is under 18.");
		} else {
			System.out.println("OK. You are an adult because your age(" + age + ") is over 18.");
		}
		
		// Reading the input double.
		System.out.println("What is the distance from your home to school?");
		double distance = input_scanner.nextDouble();
		System.out.println("You live " + distance + " miles from your school!");
		
		System.out.println("Bye for now!");
		
	}

}
