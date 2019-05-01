package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class StreamsMatchAnyUse {

	public static void main(String[] args) {
	// check if there is any match in the list as per the implementation of function passed as lambda
	boolean result = MenuUtility.getMenu().getDishList().stream().anyMatch(item -> item.getType().equals(Type.OTHER));
	System.out.println(result);
		
	}

}
