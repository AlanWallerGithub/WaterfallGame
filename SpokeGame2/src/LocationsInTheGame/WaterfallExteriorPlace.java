package LocationsInTheGame;

import java.util.Scanner;

import Characters.Donatello;
import Tools.NightToDay;
import Tools.Parsing;


public class WaterfallExteriorPlace {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	
	
	public static void waterfallExterior() {
		
		if (NightToDay.day == false) {
			Parsing.parsingTool("You find yourself outside by the waterfall.\n");
			Parsing.parsingTool("What do you want to do?\n\nNUMBER 1:\nGo down the waterfall\n\nNUMBER 2:\nGo into the cave\n\n");
			
			int responseOption = scanner.nextInt();
			
			if (responseOption == 1) {
				BelowWaterfall.accessBelow();
			}else if (responseOption == 2) {
				WaterfallInteriorPlace.waterfallInterior();
			}
			
			
		}else {
			Donatello.speakOutside();
		}
		
	}
	
	

}
