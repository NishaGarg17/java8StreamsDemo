package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class StreamsMatchMehodsUse {

	public static void main(String[] args) {
		// check if there is any match in the list as per the implementation of function
		// passed as lambda
		if (MenuUtility.getMenu().getDishList().stream().anyMatch(item -> item.getType().equals(Type.VEG))) {
			System.out.println("The menu is  somewhat vegeterian friendly");
		}

		// check if there is all match in the list as per the implementation of function
		// passed as lambda

		if (MenuUtility.getMenu().getDishList().stream().allMatch(item -> item.getType().equals(Type.VEG))) {
			System.out.println("The menu is completerly vegeterian");
		} else {
			System.out.println("Seems that not all the dishes in menu are vegeterain");
		}

		// check if there is no match in the list as per the implementation of the
		// function passed as lambda
		
		if(MenuUtility.getMenu().getDishList().stream().noneMatch(item -> item.getType().equals(Type.VEG))) {
			System.out.println("The menu is not vegeterian friendly");
		}
	}
}
