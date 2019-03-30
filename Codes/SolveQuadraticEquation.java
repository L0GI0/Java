import java.util.Scanner;
public class SolveQuadraticEquation {
	public static void main(String[] args) {
		System.out.print("Enter values a,b,c as arguemts " +
				"of polynomial ax^2 + bx + c : ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = (Math.pow(b, 2)) - (4 * a * c) ;
		System.out.println(discriminant);
		if (discriminant == 0) {
			System.out.println("x = " + (-b)/(2 * a));
		}
		else if(discriminant > 0)
		{
			System.out.println("x = " + (-b + Math.pow(discriminant, 0.5))/(2 * a));
			System.out.println("x = " + (-b - Math.pow(discriminant, 0.5))/(2 * a));
		}
		else
			System.out.println("This polynomial has no real roots");
	}
}
