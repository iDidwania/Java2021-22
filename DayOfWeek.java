import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// Create a Scanner
        Scanner input = new Scanner(System.in);
        
     // Prompt the user to enter a year, month and a day
        System.out.print("Enter the year");
        int year = input.nextInt();

        System.out.print("Enter month (1-12)");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31)");
        int day = input.nextInt();
        
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        
        // Compute the answer
        int k = year % 100; 
        int j = (int)(year / 100.0); 
        int q = day;
        int m = month;
        int h = (q + (int)((13 * (m + 1)) / 5.0) + k + (int)(k / 4.0)
       + (int)(j / 4.0) + (5 * j)) % 7;

        String result = "Day of the week is: ";
        
      //Display the name of the day of the week
        if (h == 0) 
            System.out.print(result + "Saturday");
        else if (h == 1)
            System.out.print(result + "Sunday");
        else if (h == 2)
            System.out.print(result + "Monday");
        else if (h == 3)
            System.out.print(result + "Tuesday");
        else if (h == 4)
            System.out.print(result + "Wednesday");
        else if (h == 5)
            System.out.print(result + "Thursday");
        else
            System.out.print(result + "Friday");

	}

}
