import java.util.Scanner;
public class WhatArgumentInThechar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type your character: ");
		char ch= 'a';
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is an upperacase latter");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a lowercase letter");
		else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is a numeric characert");
		//For convinience, java provides the follows methods in the 
		//charcter class which can be used in the code above
		/* isDigit(ch) return true if the specified character is a digit
		 * isLetter(ch) Returns true if the specified character is a letter
		 * isLowerCase(ch) Returns true if the specified character is an upperacase letter
		 */
	}

}
