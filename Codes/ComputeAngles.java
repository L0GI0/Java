import java.util.Scanner;
public class ComputeAngles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points in " + 
		" following order (x1, y1), (x2,y2), (x3,y3)");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//Compute three sides
		double a = Math.sqrt(Math.pow((x2-x3),2) + Math.pow((y2-y3),2));
		double b = Math.sqrt(Math.pow((x1-x3),2) + Math.pow((y1-y3),2));
		double c= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		//Display length of each side of triangle
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//Comput three angles 
		double A = Math.toDegrees(Math.acos((a*a - c*c - b*b)/(-2 * c * b)));
		double B = Math.toDegrees(Math.acos((b*b - a*a - c*c)/(-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c*c - b*b - a*a)/(-2 * a * b)));
		//Display angles before rounding 
		System.out.println("A: " + A + "B: " + B + 
			"C: " + C);
		//Display results
		System.out.println("The three angles are " +
		Math.round(A*100)/100.0 + " " + 
		Math.round(B*100)/100.0 + " " +
		Math.round(B*100)/100.0);
	}
}
