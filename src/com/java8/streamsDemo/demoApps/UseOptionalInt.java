package com.java8.streamsDemo.demoApps;

import java.util.OptionalInt;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;

public class UseOptionalInt {

	public static void main(String[] args) {
		// if stream is empty default max value is 0 which is a wrong result
		OptionalInt maxCalorieDish = MenuUtility.getMenu().getDishList().stream().mapToInt(Dish :: getCalories).max();
		System.out.println(maxCalorieDish.orElse(-1)); // print -1 if  max calorie dish not found

	}

}
