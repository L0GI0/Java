import java.util.Scanner;
public class SubstractionQuiz {
	public static void main(String[] args) {
		//1.Generate two random single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		//2. If number1 < numer2, swap numer1 with number2
		if(number1 < number2) {
			int tmp = number2;
			number2 = number1;
			number1 = number2;
		}
		
		// 3. Prompt the student to answer "What is number1 - numer2?"
		System.out.print
		("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer  = input.nextInt();
		//4. Grade the answer and display result 
		if(number1  - number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " - " + number2 +
					" should be " + (number1 - number2));
		}
	}
}
