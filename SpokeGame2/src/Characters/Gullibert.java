package Characters;

import java.util.ArrayList;
import java.util.Scanner;

import ConversationStuff.Conversation;

import ConversationStuff.GDialogueI;
import LocationsInTheGame.WaterfallInteriorPlace;
import Tools.NightToDay;
import Tools.Parsing;

public class Gullibert {
	static Scanner scanner = new Scanner(System.in);
	
public static String name = "Gullibert";
	
	public static ArrayList<String> items = new ArrayList<String>();
	
	
	public static void receiveItem(String item) {
		

		items.add(item);
		
	}
	
	
	public static void speakInside() {
		Conversation.returnedValue[0] = 1;
		//maybe he could have received the stick from Donatello, too
		int loopContinues = 1;
		
		int phaseNum = 1;
		//are phase numbers necessary?
		
		Parsing.parsingTool(GDialogueI.gullibertGreetingInside);
		
		while(loopContinues == 1) {
			int[] returnedResult = Conversation.haveConversation(phaseNum, "Inside", name, GDialogueI.meConvoInside, GDialogueI.gullibertConvoInside);
			
			loopContinues = returnedResult[0];
			if (NightToDay.day == false) {
				loopContinues = 0;
				Parsing.parsingTool("GULLIBERT: Oops! it is night time, i'll go to bed\n");
				Parsing.parsingTool("Gullibert and Donatello go to bed. A mysterious man comes out of his room and goes down the staircase down the waterfall.\n");
				
				WaterfallInteriorPlace.waterfallInterior();
				//well, more or less
			}
			
			//This seems to work, the loop mechanism etc, does it entirely? check for cases
		}
		
	}

}
