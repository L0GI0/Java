
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercises {

	public static void main(String[] args) {
		
			Date date = new Date();
			System.out.println(date);
			int day = date.getDay();
			day++;
			//System.out.println("Day of the week: " + day);
			if(day == 6 || day == 7)
				System.out.println("It is weekend");
			else System.out.println("It is not the weekend ");
		
				
			 SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");  
			 System.out.println(formatter.format(date));  
			
	}

}
