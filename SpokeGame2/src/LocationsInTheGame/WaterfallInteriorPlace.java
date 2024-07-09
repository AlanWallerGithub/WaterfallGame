package LocationsInTheGame;

import java.util.Scanner;

import Characters.Donatello;

import Tools.NightToDay;
import Tools.Parsing;

public class WaterfallInteriorPlace {
	static Scanner scanner = new Scanner(System.in);
	
	public static boolean firstTimeInside = false;
	
	public static void waterfallInterior() {
		
		if (NightToDay.day == false) {
			
		SomeExplorationInside.explore();
			//else, if night is day
		}else {
			
		
		
		Parsing.parsingTool("DONATELLO: OK. Follow me\n");
		
		if (firstTimeInside == false) {
			
			Parsing.parsingTool("*You find yourself inside a cave inside the waterfall. There is a couch on the side, a place to warm yourself, and a door*\n");
			
			firstTimeInside = true;
		}
		
		Donatello.speakInside();
		
		}
	}

}
