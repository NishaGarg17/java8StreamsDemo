package com.java8.streamsDemo.demoApps;


import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;

public class LowCalorieMenuUsingStreams {

	public static void main(String[] args) {
		 List<Dish> lowCalorieDishList = MenuUtility.getMenu().getDishList().stream().filter(dish -> dish.getCalories() < 400)
		.limit(3).collect(toList());
		 lowCalorieDishList.sort(Comparator.comparing((Dish dish) -> dish.getCalories()));
		 System.out.println("Low calorie dishes are: ");
		 for(Dish dish: lowCalorieDishList) {
			 System.out.println(dish);
		 }
	}

}
		