import java.util.Scanner;
public class PalindromeIngoreNonAlphanumeric {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("Ingoring nonalphanumeric characters, \nis "
				+ s + " a polindrome? " + isPalindrome(s));
		
		// Return true if a string is a polindrome 
		public static boolean isPalindrome(String s) {
			// Create a new string by elemeninating nonalphanumeric chars
			String s1 = filters(s);
			
			// Create a new string that is the reversal of s1 
			String s2 = reverse(s1);
			
			// Check if the reversal is the same as the original string
			return s2.equals(s1);
		}
		// Create a new string by eleminating nonalphanumeric chars
		public static String filters(String s) {
			// Create a string builder 
			StringBuilder stringBuilder = new StringBuilder();
			// Examine each char in the string to skip alphanumeric char
					for (int i = 0; i < s.length; i++) {
						if (Character.isLetterOrDigit(s.charAt(i))) {
							stringBuilder.append(s.charAt(i));
						}
					}
			return stringBuilder.toString();
		}
		
		//Create a new string by reversing a specified string
		public static String reverse(String s) {
			StringBuilder stringBuilder = new StringBuilder(s);
			stringBuilder.reverse(); // Invoke reverse in String Builder
			return stringBuilder.toString()
			
		}

	}

}
