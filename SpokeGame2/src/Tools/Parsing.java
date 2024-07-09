package Tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ConversationStuff.Conversation;

public class Parsing {
	public static boolean weBranchOut = false;
	
	
	private static String charName;
	private static String place;
	private static String methodName;
	
	
	public static int parserCounter = 0;
	
	public static void parsingTool(String stringToParse) {
		
		
		// First, string to parse gets lenghted into a variable, and added up
		
		parserCounter += stringToParse.length();
		

		
		for (int i = 0; i<stringToParse.length(); i++) {
			// $ means there is a function
			if (stringToParse.charAt(i) == '$') {
				
				// I could reduce this by saying that the position at this +1 simply means the charName, regardless of what the charName IS. so it's always D, or it's always O, etc. the positions and names could be whatever
				
				charName = stringToParse.charAt(i+1)+"";
				place = stringToParse.charAt(i+2)+"";
				methodName = stringToParse.charAt(i+3)+"";
				
				
				
				
				
				try {
					Method method = Class.forName("ConversationStuff."+charName+"Dialogue"+place).getMethod(charName+place+"Actions"+methodName);

					method.invoke(null);
					//The method invocation doesnt need responseOption if it isnt a switch, but instead individual methods for all their different actions
				} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException
						| ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				if (stringToParse.indexOf(stringToParse.charAt(i+3)) < stringToParse.length()-1) {
			
					weBranchOut = true;
					
				}else {
				
					break;
					
				}
				
			}
			
			if (weBranchOut == true || stringToParse.charAt(i) == '@') {
				

				
				Conversation.position = stringToParse.substring(stringToParse.lastIndexOf("@")+1);
				
		
			weBranchOut = false;
			
			break;
			}
			
			//DEBUGGING
			System.out.print(stringToParse.charAt(i));
			
			if(stringToParse.charAt(i) == ' ') {
			
					try {Thread.sleep(11);} catch(Exception e) {};
				
				
			}else if (stringToParse.charAt(i) == '.' || stringToParse.charAt(i) == '!' || stringToParse.charAt(i) == '?' || stringToParse.charAt(i) == ':') {
				
					try {Thread.sleep(10);} catch(Exception e) {};
				
				
			}else {
				
					try {Thread.sleep(11);} catch(Exception e) {};
				
				
			}
			
			
			
		}
		
		System.out.print("\n");
	
	    NightToDay.turnNightToDay();
	    
	    



	}

}
