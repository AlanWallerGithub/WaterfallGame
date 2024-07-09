package ConversationStuff;

import java.util.Scanner;


import Tools.Parsing;

public class Conversation {
	
	// preIndex
	
	static int preIndex = 0;
	// postIndex
	
	//now the issue is also creating more story. what is happening, what is the ring for, etc
	
	static int postIndex = 0;
	
	// position value
	
	public static String position = "00";
	// Our boolean
			public static int[] returnedValue = {1,0};
	// First round variables
	
	static boolean firstRound = true;

	
	static Scanner scanner = new Scanner(System.in);
	
	public static int[] haveConversation(int phase, String place, String charName, String[][][] speaker1, String[][][] speaker2) {
		
	
		// check 3 1 dot length
		preIndex = Integer.parseInt(position.charAt(0)+"");
		
		postIndex = Integer.parseInt(position.charAt(1)+"");
		// FIRST, we show the options
		
		if (firstRound == true) {
			Parsing.parsingTool("** YOUR POSSIBLE RESPONSES. ENTER CORRESPONDING NUMBER FOR THE RESPONSE. **\n");
			firstRound = false;
		}
		
		if (position.equals("00") == false) {
		
			for (int i = 0; i<speaker1[preIndex][postIndex].length; i++) {
				Parsing.parsingTool("NUMBER "+(i+1)+": ");
				Parsing.parsingTool(speaker1[preIndex][postIndex][i]);
			}
		}else {
			
		
		for (int i = 0; i<speaker1.length; i++) {
			//cant access THIS PART once we return to 00, dammitttt, dammmit
		
			Parsing.parsingTool("NUMBER "+(i+1)+": ");
			//This mess below is the position 0 for the POSITION string, converted back to an int
			if (i == preIndex) {
			
				
				Parsing.parsingTool(speaker1[i][postIndex][0]);
				
			}else {
				

				Parsing.parsingTool(speaker1[i][0][0]);
				
				
			}
			System.out.println();
		
			
		}
		}
		// end of for
		
		int responseOption = scanner.nextInt();
		
	//aqui les posicions canvien totalment
		if (position != "00") {
			Parsing.parsingTool(speaker2[preIndex][postIndex][responseOption-1]);
		}else {
			
	// once questioning has finished, it should stop the loop
		Parsing.parsingTool(speaker2[responseOption-1][postIndex][0]);
		
		}
		
		return returnedValue;
			
	}

}
