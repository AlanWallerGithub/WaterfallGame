package Tools;

public class NightToDay {
	
	// Here we know that other methods can call this variable and check if it's day or night, and so act accordingly
	public static boolean day = true;
	
public static void turnNightToDay() {
	

	// parserCounter being 300 characters is OPTIONAL,
	//change it to whatever value it works
	if(Parsing.parserCounter >= 5000) {
	
		if (day == true) {
			System.out.println("\n~~IT IS NIGHT TIME~~\n");
			Parsing.parserCounter = 0;
			day = false;
		
		}else if (day == false) {
			System.out.println("\n~~IT IS DAY TIME~~\n");
			Parsing.parserCounter = 0;
			day = true;
		}
		
		
	}
	

}




}
