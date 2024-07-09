package LocationsInTheGame;

import java.util.Scanner;

import Characters.Donatello;
import Characters.Gullibert;
import Characters.Me;
import Tools.NightToDay;
import Tools.Parsing;

public class SomeExplorationInside {
	static Scanner scanner = new Scanner(System.in);
	public static void explore() {
		
		if (NightToDay.day == true) {
		int loopContinues = 1;
		
		while(loopContinues == 1) {
			Parsing.parsingTool("You're inside the waterfall. Nice kncave, with some comfortable furniture. There's a few things you can do.\n\nNUMBER 1:\nGo to the door that says DORM\n\nNUMBER 2:\nGo look under the carpet\n\nNUMBER 3:\nTalk to Donatello\n\nNUMBER 4:\nTalk to the other guy looking over there, he's next to the dorm\n\n");
		 int responseOption = scanner.nextInt();
   	 
   	 if (responseOption == 1) {
   		 
   		 Parsing.parsingTool("This door is fantastic. Great sleep must be had here, in the dorm. I hope one day I can do there... but it seems i can't enter it through here. There isn't even a doorknob!\n");
   		 
   	 }else if (responseOption == 2) {
   		 if (Me.items.contains("infoForMe")) {
	    			Parsing.parsingTool("Well, well. A carpet... although, looking more closely, it seems there's a key. I wonder if I cna take it. I will!\n");
	    			
	    			Me.receiveItem("key");
	    			// now you can enter or something
	    			Me.items.remove("infoForMe");
	    		}else {
	    		 Parsing.parsingTool("Well, well. A carpet. Maybe my eyes aren't good enough yet, but I can't see anything of value. Maybe a small orange\n");
	    		 }
   	 }else if (responseOption == 3) {
   		loopContinues = 0;
   			Donatello.speakInside();
   	 }else if (responseOption == 4) {
   		loopContinues = 0;
   			Gullibert.speakInside();
   	 }
   	 //SWITCHING THE DAY
   	 if(NightToDay.day == false) {
   		Parsing.parsingTool("Gullibert and Donatello go to bed.A mysterious man comes out of his room and goes down the staircase down the waterfall. The room is alone. \n");
   		loopContinues = 0;
   		explore();
   	 }
	}
		
		
	}else if(NightToDay.day == false) {
		
int loopContinues = 1;
		
		while(loopContinues == 1) {
		
		
		
		Parsing.parsingTool("*You find yourself inside a cave inside the waterfall. There is a couch on the side, a place to warm yourself, and a door*\n");
		
		Parsing.parsingTool("You're inside the waterfall. Nice cave, with some comfortable furniture. There's a few things you can do.\n\nNUMBER 1:\nGo to the door that says DORM\n\nNUMBER 2:\nGo look under the carpet\n\nNUMBER 3:\nGo outside\n\n");
		   
		int responseOption = scanner.nextInt();
    	 
    	 if (responseOption == 1) {
    		 
    		 Parsing.parsingTool("This door is fantastic. Great sleep must be had here, in the dorm. I hope one day I can do there... but it seems i can't enter it through here. There isn't even a doorknob!\n");
    		 
    	 }else if (responseOption == 2) {
    		if (Me.items.contains("infoForMe")) {
    			Parsing.parsingTool("Well, well. A carpet... although, looking more closely, it seems there's a key. I wonder if I cna take it. I will!\n");
    			
    			Me.receiveItem("key");
    			
    			Me.items.remove("infoForMe");
    			// now you can enter or something
    		}else {
    		 Parsing.parsingTool("Well, well. A carpet. Maybe my eyes aren't good enough yet, but I can't see anything of value. Maybe a small orange\n");
    		 }
    		
    	 }	else if (responseOption == 3) {
    		 loopContinues = 0;
    		 WaterfallExteriorPlace.waterfallExterior();
    	 }
      	 //SWITCHING THE DAY
       	 if(NightToDay.day == true) {
				
       		loopContinues = 0;
       		explore();
       	 } 
	}	 
	}
		}
	
}
