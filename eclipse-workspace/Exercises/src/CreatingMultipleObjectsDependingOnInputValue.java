
public class CreatingMultipleObjectsDependingOnInputValue {
	public static void main(String[] args) {
		
		
		int numberOfObjects = Integer.parseInt(args[2]);
		int i;
		for(i = 0; i < Integer.parseInt(args[2]); i++) {
		exerciseClass object = new exerciseClass();
		}
	}
}
	 class exerciseClass{
		static int count = 0;
		exerciseClass(){
			System.out.println(++count + ". " + "Hello!");
		}
		};
	