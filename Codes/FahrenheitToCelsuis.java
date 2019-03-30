import java.util.Scanner;
public class FahrenheitToCelsuis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsuis = (5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsuis + " in Celsuis");
	}

}
