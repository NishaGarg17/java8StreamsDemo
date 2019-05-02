package com.java8.streamsDemo.demoApps;

import java.util.Optional;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class StreamsFindAnyAndOptionalClass {
	public static void main(String args[]) {
		Optional<Dish> vegDish = MenuUtility.getMenu().getDishList().stream().filter(item -> item.getType().equals(Type.VEG)).findAny();
		vegDish.ifPresent(System.out :: println);
		
		if(vegDish.isPresent()) {
			System.out.println("Congrats!! Veg dishes present in Menu named as: " + vegDish.get().getName());
	
		}
		// In case Optional has a value; orElse is still called but not used. On the contradictory orElseGet is not called.
		vegDish.orElse(new Dish("Manchoorian", true, 400, Type.VEG));
		vegDish.orElseGet(() -> new Dish("Pasta", true, 400, Type.VEG));
		
		Optional<String> vegDishName = MenuUtility.getMenu().getDishList().stream().filter(item -> item.getType().equals(Type.VEG)).map(item -> item.getName()).findAny();
		vegDishName.ifPresent(System.out :: println);
		vegDishName.orElse("Random name generated as there is no name for the dish given");
		
		
	}
}
