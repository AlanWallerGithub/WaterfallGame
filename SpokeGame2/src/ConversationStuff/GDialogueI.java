package ConversationStuff;

import java.util.Scanner;

import Characters.Donatello;
import Characters.Me;
import Tools.Parsing;


public class GDialogueI {
	
	static Scanner scanner = new Scanner(System.in);
	
    public static String gullibertGreetingInside = "GULLIBERT: Now, now, who do we have here? Nice to meet you!\n";
	
	public static String[][][] meConvoInside = {{{"I am Destinoso. How are you?\n"}},
			{{"This is a nice cave, really\n"}},
			{{"What is this cave?\n"}},
			{{"What is that door?\n"}},
			{{"Bye.\n"}}};
	
	public static String[][][] gullibertConvoInside = {{{"GULLIBERT: I am Gullibert, son of Father. I protect the dorm\n"}},
			{{"GULLIBERT: Of course! It's our paradise\n"}},
			{{"GULLIBERT: A cave of destiny\n"}},
			{{"GULLIBERT: It's the door to the dorm. But we keep the key down under the down below part.\n$GI4"}},
			{{"$GI5"}}};
	
    public static void GIActions5() {

    	DDialogueI.DIActions5();
    	 
   }
    
    public static void GIActions4() {
    	
    	if (Me.items.contains("ring") && Donatello.items.contains("stick")) {
    		Parsing.parsingTool("GULLIBERT: Oh wait... you have Donatello's friendship ring! And he has your stick! In that case, let me share with you a friend secret amongst friends: under the carpet of this room is a key. Maybe you didn't see it the first time... look again! It's important for your quest\n");
    	
    		Me.receiveItem("infoForMe");
    		
    		gullibertConvoInside[3][0][0] = "GULLIBERT: It's the door to the dorm. Keep that in mind\n";
    	}else {
    		Parsing.parsingTool("GULLIBERT: But only a true friend of mine could receive this info, and you're not a friend of Donatello's. He would have received something from you, something from him would have been given to you, true friendship is bonded, in the castle\n");
    	}

    	
    	 
   }

}
