/**
 * Simulate the intial roll of a Craps Dice Game
 * 
 * // print one of the following // User wins, User Loses, Point is set = x
 * 
 * @author Siva Jasthi (thisisjava.com)
 *
 */
public class CrapsDiceGame {

	public static void main(String[] args) {

		// ========== roll the dice for the first time ==========
		System.out.println("Opening Rolls:");
		int die1 = (int) ((Math.random() * 6) + 1);
		int die2 = (int) ((Math.random() * 6) + 1);

		System.out.println("Die 1 value = " + die1);
		System.out.println("Die 2 value = " + die2);
		int total = die1 + die2;
		System.out.println("Total Value = " + total);

		// TODO: Your code starts here
		if (total == 7 || total == 11) {
			System.out.println("Congragulations, you have won!");
		} else if (total == 2 || total == 3 || total == 12) {
			System.out.println("Sorry, you have lost!");
		} else {
			System.out.println("Point = x. Please run again.");
		}
		// TODO: Your code ends here

	}
}