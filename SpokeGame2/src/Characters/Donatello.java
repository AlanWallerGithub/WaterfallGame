package Characters;
import java.util.ArrayList;
import java.util.Scanner;

import ConversationStuff.Conversation;
import ConversationStuff.DDialogueI;
import ConversationStuff.DDialogueO;
import LocationsInTheGame.WaterfallExteriorPlace;
import LocationsInTheGame.WaterfallInteriorPlace;
import Tools.NightToDay;
import Tools.Parsing;
public class Donatello {
	static Scanner scanner = new Scanner(System.in);
	public static String name = "Donatello";
	
	public static ArrayList<String> items = new ArrayList<String>();
	
	
	public static void receiveItem(String item) {
		

		items.add(item);
		
	}
	
	public static void speakOutside() {
		
		
		Conversation.returnedValue[0] = 1;
		int loopContinues = 1;
	
		int phaseNum = 1;
		
		//Waterfall Entrance dialogue
		Parsing.parsingTool(DDialogueO.donatelloGreetingOutside);
		
		while(loopContinues == 1) {
			int[] returnedResult = Conversation.haveConversation(phaseNum, "Outside", name, DDialogueO.meConvoOutside, DDialogueO.donatelloConvoOutside);
			
			loopContinues = returnedResult[0];
			if (NightToDay.day == false) {
				loopContinues = 0;
				Parsing.parsingTool("DONATELLO: Oops! it is night time, i'll go to bed\n");
				Parsing.parsingTool("Donatello goes to bed. A mysterious man comes out of the cave past the waterfall and goes down the staircase down the waterfall.\n");
				
			WaterfallExteriorPlace.waterfallExterior();
		
			}

		}
	
		
	}
	
	public static void speakInside() {
		Conversation.returnedValue[0] = 1;
		int loopContinues = 1;
		
		int phaseNum = 1;
		//are phase numbers necessary?
		
		Parsing.parsingTool(DDialogueI.donatelloGreetingInside);
		
		while(loopContinues == 1) {
			int[] returnedResult = Conversation.haveConversation(phaseNum, "Inside", name, DDialogueI.meConvoInside, DDialogueI.donatelloConvoInside);
			
			loopContinues = returnedResult[0];
			if (NightToDay.day == false) {
				loopContinues = 0;
				Parsing.parsingTool("DONATELLO: Oops! it is night time, i'll go to bed\n");
				Parsing.parsingTool("Donatello and Gullibert go to bed. A mysterious man comes out of his room and goes down the staircase down the waterfall.\n");

				WaterfallInteriorPlace.waterfallInterior();
			}
			
			//This seems to work, the loop mechanism etc, does it entirely? check for cases
		}
		
	}

}
