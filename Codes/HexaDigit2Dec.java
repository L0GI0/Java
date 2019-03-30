import java.util.Scanner;
public class HexaDigit2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();
		if (hexString.length() != 1) {
			System.out.println("You must enter excacly one character");
			System.exit(1);
		}
		
		//Display decima value for th hex digit
		char ch = hexString.charAt(0);
		if (ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digid" +
			ch + " is " + value);
		}
		else if(Character.isDigit(ch)) {
			System.out.println("The decimal value foe hex digit" +
		ch + " is " + ch); 
		}
		else 
			System.out.println(ch + "is an invalid input");		
	}
}
