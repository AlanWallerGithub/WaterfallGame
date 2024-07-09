package ConversationStuff;

import java.util.Scanner;

import LocationsInTheGame.SomeExplorationInside;
import LocationsInTheGame.WaterfallExteriorPlace;


public class DDialogueI {
	// First round of dialogue
	static Scanner scanner = new Scanner(System.in);
	
    public static String donatelloGreetingInside = "DONATELLO: Well, here we are. Inside the waterfall\n";
    
	// Constantly changing ArrayList for answers
	
	public static String[][][] meConvoInside = {{{"Why is there an inside to the waterfall?\n"}},
			{{"What is the point of crossing the waterfall?\n"}},
			{{"What is the point of going down there? Beyond the waterfall? What do you mean by that?\n"}},
			{{"Am I in the right place? Could I go outside?\n"}},
			{{"Bye.\n"}}};
	
	//after bye there should be a narrative dialogue that invites you to explore
	
	public static String[][][] donatelloConvoInside = {{{"DONATELLO: It's an inside because the Father clan wanted it to be that way\n"}},
			{{"DONATELLO: Well, it allows you to go to the other side\n"}},
			{{"DONATELLO: What do you mean?\n"}},
			{{"DONATELLO: Well, you could go outside. You're a guest\n$DI4"}},
			{{"$DI5"}}};
	//well well, fix these things
	
	public static void DIActions4() {
		
		WaterfallExteriorPlace.waterfallExterior();
	}
	
	
    public static void DIActions5() {
    	
   
		   Conversation.returnedValue[0] = 0;
		   
		  SomeExplorationInside.explore();
		   
   }
    
    
}
