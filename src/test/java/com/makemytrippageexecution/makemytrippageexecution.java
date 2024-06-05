package com.makemytrippageexecution;


import com.makemytripbaseclass.makemytripbaseclass;
import com.makemytrippageobject.MakeMyTripLocators;


public class makemytrippageexecution extends MakeMyTripLocators {
	
	public static void Chennaisearch(String name) {
		makemytripbaseclass.inputdata(MakeMyTripLocators.FromScearch().click(), name);
		
	}
	
	public static void bengaluru(String name) {
		makemytripbaseclass.inputdata(MakeMyTripLocators.ToSearch().click(), name);
		
	}
}
