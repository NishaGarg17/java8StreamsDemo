package com.java8.streamsDemo.demoApps;

import static java.util.stream.Collectors.toList;
import java.util.List;
import com.java8.streamsDemo.utility.MenuUtility;

public class StreamsOrderOfEvaluation {

	public static void main(String[] args) {
		/* List<String> lowCalorieDishList = MenuUtility.getMenu().getDishList().stream().filter(dish -> {
			 System.out.println("filtering:: " + dish);
			 return dish.getCalories() < 400;}).map(d -> {System.out.println("Mapping: " + d);
			 return d.getName();})
		.limit(3).collect(toList());

		 System.out.println("Low calorie dishes are: ");
		 for(String dishName : lowCalorieDishList) {
			 System.out.println(dishName);
		 }*/
		
		 
		 // for each is also a terminal operation, let's see the use of it...
		System.out.println("Low calorie dishes are: ");
		 MenuUtility.getMenu().getDishList().stream().
		 filter(dish -> dish.getCalories() < 400).map(dish -> dish.getName()).limit(3).forEach(System.out :: println);;

		
		 
	}

}
