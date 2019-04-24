package com.java8.streamsDemo.demoApps;

import java.util.ArrayList;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.sort.SortLowCalorieDishes;
import com.java8.streamsDemo.utility.MenuUtility;


// Prepare low calorie menu which return the names of dishes that are low in
// calories, sorted by number of calories
public class LowCalorieMenu {

	public static void main(String[] args) {
		ArrayList<Dish> dishList = MenuUtility.getMenu().getDishList();
		ArrayList<Dish> lowCalorieDishList = new ArrayList<Dish>();
		// print the list of dishes available in Menu
		System.out.println("List of dishes available in Menu: ");
		MenuUtility.pritnMenu(MenuUtility.getMenu().getDishList());
		// find the dishes which are low in calories
		for (Dish dish : dishList) {
			if (dish.getCalories() < 400) {
				lowCalorieDishList.add(dish);
			}
		}
		// print the list of  low calorie menu
		System.out.println("\nLow calorie menu (calorie < 400) is: ");
		MenuUtility.pritnMenu(lowCalorieDishList);
		lowCalorieDishList.sort(new SortLowCalorieDishes());
		
		// print the list of low calorie menu sorted by calorie
		System.out.println("\nLow calorie menu sorted by calorie (calorie < 400) is: ");
		MenuUtility.pritnMenu(lowCalorieDishList);

	}

}
