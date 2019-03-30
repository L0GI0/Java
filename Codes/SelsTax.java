// Prints Salestax with two digits after decimal point 
import java.util.Scanner;

public class SelsTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purasche amount: ");
		double purascheAmount = input.nextDouble();
		//tax is 6% of purasche amount
		double tax = purascheAmount * 0.06;
		System.out.println("Purasche amount is: " +  purascheAmount + 
				"tax is 6% of purasche amount: " + tax);
		int x = (int)(tax * 100);
				System.out.println("(int)(tax*100) is " + x);
		System.out.println("Sales tax is $ ((int)(tax*100)/100.0): "+ x/100.0);
		

	}

}
