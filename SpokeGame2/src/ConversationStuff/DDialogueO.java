package ConversationStuff;


import java.util.Scanner;

import Characters.Donatello;
import Characters.Me;
import LocationsInTheGame.BelowWaterfall;
import LocationsInTheGame.WaterfallInteriorPlace;
import Tools.Parsing;

public class DDialogueO {
	
	static Scanner scanner = new Scanner(System.in);
	
	// Constantly changing ArrayList for answers
	
	public static String[][][] meConvoOutside = {{{"What is this waterfall?"}},
			{{"Show me around the place."}},
			{{"My name is Destinoso. And you?"}},
			{{"What a great shirt you're wearing."},{"Interesting. I'm wearing sandals and a great wooden stick. Do you like them?\n","If you want I can give you my stick.\n"},{"Would you use them? In that case, yes.\n"}},
			{{"Bye."}}};
	
	
	
	public static String[][][] donatelloConvoOutside = {{{"DONATELLO: This is the waterfall of oblivion, a great place to be. Created by the ancients in times immemorial. We love it here, because it is the great place to be. Let this be a warning: this is no normal waterfall.\n"}},
			{{"$DO2"}},
			{{"$DO3"}},
			{{"DONATELLO: It is, a great ancient person gave it to me, it was a gift from times before this time. A wonderful gift if I may say so. What is this clothing you are wearing yourself?\n$DO4@31"},{"DONATELLO: Much. Could you give them to me? They would be useful for me to track some wilderness in the woods.\n@32","DONATELLO: Yes! I would love that.\n$DO6"},{"$DO6"}},
			{{"$DO5"}}};
	
	/*So maybe we can loop over the loop and have the array insert its appropriate answers into the new array of answers*/
	
	// WELCOME MESSAGE outside
	
    public static String donatelloGreetingOutside = "DONATELLO: Hello there! Welcome to the waterfall. What would you like to do?\n";
    
    // First round of questions
    


    // First round of answers
    
    
    // Second round of QUESTIONS
    
    
    public static String[] userResponseOutside1 = {"Hmm","",""};
    
    
    
    
    // methods are ***** here
    
    public static void DOActions2() {
    	
    	 WaterfallInteriorPlace.waterfallInterior();
		   Conversation.returnedValue[0] = 0;
    }
    
    public static void DOActions3() {
    	
		   //must convert to parser
		  Parsing.parsingTool("DONATELLO: I am Donatello, of the Father clan. Let us be friends.\n");
		   Me.receiveItem("ring");
		   
		   //These get changed forever
		   meConvoOutside[2][0][0] = "As usual, nice to know you and be friends with you, Donatello";
		   
		   donatelloConvoOutside[2][0][0] = "DONATELLO: I agree!";
   }
    
    public static void DOActions4() {
    	
    	
   }
    
    public static void DOActions6() {
    	
    	Parsing.parsingTool("YOU GIVE YOUR STICK TO DONATELLO");
    	// implement this
    	Donatello.receiveItem("stick");
    	
    	   //These get changed forever
		   meConvoOutside[3][1][0] = "Indeed your clothes are glorious! Glad to hear about the Father clan.\n";
		   meConvoOutside[3][1][1] = "Truly a wonderful day.\n";
		   
		   donatelloConvoOutside[3][0][0] = "DONATELLO: It is, a great ancient person gave it to me, it was a gift from times before this time. A wonderful gift if I may say so. And the stick you gave me is wonderful too. Great!\n$DO4@31";
		   
		   donatelloConvoOutside[3][1][0] = "DONATELLO: The Father clan was the best thing that happened to this place. Glory to the king.@00";
		   
		   donatelloConvoOutside[3][1][1] = "DONATELLO: The best day of all.@00";
		   
    	Conversation.position = "00";
    	
    	
    }
    
    public static void DOActions5() {
    	
    	Conversation.returnedValue[0] = 0;
    	// this could be a looped passage that allows you to do stuff eternally until you do it
    	 Parsing.parsingTool("You're outside the waterfall. You see a stone bridge going downwards to the inner parts. You can do a few things here, what do you do? What do you want to do?\n\nNUMBER 1:\nExplore the outside waterfall, ie, go down the steps\n\nNUMBER 2:\nTalk to Donatello\n\n");
    	 
    	 int responseOption = scanner.nextInt();
    	 
    	 if (responseOption == 1) {
    		 
    		 BelowWaterfall.accessBelow();
    		 
    	 }else if (responseOption == 2) {
    			Donatello.speakOutside();
    	 }
    
    
    	 
    	 
    	 
    	 
   }
   
   public static void DonatelloOutsideActions(int index, int phase) {
	   
	   // it should keep track of the phase of the conversation
    	
    	 //Go to inside
	   switch(index) {
	   case 2:
		   
//		   WaterfallInteriorPlace.waterfallInterior();
//		   Conversation.returnedValue[0] = 0;
		   break;
	   case 3:

//		   //must convert to parser
//		  Parsing.parsingTool("DONATELLO: I am Donatello, of the Father clan. Let us be friends.\n");
//		   Me.receiveItem("ring");
//		   
//		   //These get changed forever
//		   meConvoOutside[2][0] = "As usual, nice to know you and be friends with you, Donatello";
//		   
//		   donatelloConvoOutside[2][0] = "I agree!";
	
		   break;
	   case 4:
		   
		   break;
	   case 5:
		   
//		   Parsing.parsingTool("END OF CONVERSATION");
		   
		   break;
	   }
    	
    	
    	
    }
   
    
    public static String[] donatelloResponseOutside2 = {"","",""};
    

}
