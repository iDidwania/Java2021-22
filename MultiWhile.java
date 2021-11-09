import java.util.Scanner;

public class MultiWhile {

	public static void main(String[] args) {
		
		Scanner input_scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = input_scanner.nextInt();
		        
        int range = 20;

        int i = 1;
  
        while (i <= range) {
              System.out.println(number + " * " + i + " = " + number * i); 
              i++;
	}
	}
}
