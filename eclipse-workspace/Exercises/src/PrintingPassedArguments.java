
public class PrintingPassedArguments {

	public static void main(String[] args) {
		System.out.println(args.length - 2);
		int i;
		float min = Float.parseFloat(args[2]), max =  Float.parseFloat(args[2]);
		float average, sum = 0;
		for(i = 2; i < args.length; i++) {
			System.out.println((i + 1) + " " + args[i]);
			if(min > Float.parseFloat(args[i]))
				min = Float.parseFloat(args[i]);
			if(max < Float.parseFloat(args[i]))
				max = Float.parseFloat(args[i]);
			sum += Float.parseFloat(args[i]);
		}
		average = sum/(args.length - 2);
		System.out.println("Maximum value is: " + max);
		System.out.println("Minimum value is: " + min);
		System.out.println("Arithmetic average is: " + average);
	}
	
	
}
