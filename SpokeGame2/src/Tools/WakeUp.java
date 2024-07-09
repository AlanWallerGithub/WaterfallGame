package Tools;

import LocationsInTheGame.WaterfallExteriorPlace;

public class WakeUp {

	
	public static void wakey() {
		NightToDay.day = true;
		
		
		
		Parsing.parsingTool("It's day time again. You slept, but can't remember what it did to you, your soul is confused, and sleep didn't help, it was not good. But still, you're awake now buddy, walk up, here it is, whatever it is, let is go\n");
		
		WaterfallExteriorPlace.waterfallExterior();
	}
}
