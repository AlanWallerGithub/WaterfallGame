package Characters;

import java.util.ArrayList;

import Tools.Parsing;

public class Me {
	
	
	
	public static String name = "Destinoso";
	
	// My array
	
	public static ArrayList<String> items = new ArrayList<String>();
	
	public static void receiveItem(String item) {
		

		items.add(item);
		Parsing.parsingTool("YOU HAVE RECEIVED "+item.toUpperCase()+"\nYour item box is now:\n"+items.toString());
	

		
	}

}
