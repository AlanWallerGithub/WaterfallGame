package LocationsInTheGame;

import Characters.Me;
import Tools.Parsing;
import Tools.WakeUp;

public class UnderTheWaterfall {
	
	public static void goUnder() {
		Parsing.parserCounter = 0;
		if (Me.items.contains("key")) {
			
			
			
			Parsing.parsingTool("We're under. You're under the waterfall and a person is there.\n");
			Parsing.parsingTool("They open the door to the end.\n");
			Parsing.parsingTool("Well, you follow them. You use your key.\n");
			Parsing.parsingTool("THE END");
			System.exit(0);
			
		}else {
		
			Parsing.parsingTool("We're under. You're under the waterfall and a person is there.\n");
			Parsing.parsingTool("They open the door to the end.\n");
			Parsing.parsingTool("You see them open something with a key\n");
		
		WakeUp.wakey();
		
		
		}
	}

}
