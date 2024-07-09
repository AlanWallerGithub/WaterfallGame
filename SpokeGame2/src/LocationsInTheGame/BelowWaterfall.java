package LocationsInTheGame;
import java.util.Scanner;

import ConversationStuff.DDialogueO;
import Tools.NightToDay;
import Tools.Parsing;
public class BelowWaterfall {
	static Scanner scanner = new Scanner(System.in);
	public static void accessBelow() {
		if (NightToDay.day == false) {
			//if nothing here, then we go into this loop
			boolean endLoop = false;
			while(endLoop == false) {
				
			// it's not closed if its night time
			Parsing.parsingTool("This is a wet place and the door is open. Someone seems to have walked in.\nNUMBER 1:\nGo inside\nNUMBER 2:\nNo, go back");
			
			 int responseOption = scanner.nextInt();
	if (responseOption ==1) {
		endLoop = true;
		UnderTheWaterfall.goUnder();
	}else if(responseOption ==2) {
		Parsing.parsingTool("OK.");
		WaterfallExteriorPlace.waterfallExterior();
	}
			
	

	
			}
			
			
		}else {
		
		//if nothing here, then we go into this loop
		boolean endLoop = false;
		while(endLoop == false) {
			
		// it's not closed if its night time
		Parsing.parsingTool("This is a wet place with a closed door. Wanna go back?\nNUMBER 1:\nYes\nNUMBER 2:\nNo");
		
		 int responseOption = scanner.nextInt();
if (responseOption ==1) {
	endLoop = true;
	DDialogueO.DOActions5();
}else if(responseOption ==2) {
	Parsing.parsingTool("OK.");
}
		
		}		
		
		}
		
		
	}

}
