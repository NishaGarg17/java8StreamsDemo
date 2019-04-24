package com.java8.streamsDemo.sort;

import java.util.Comparator;

import com.java8.streamsDemo.entity.Dish;

public class SortLowCalorieDishes implements Comparator<Dish> {

	@Override
	public int compare(Dish dish1, Dish dish2) {
		return (int) (dish1.getCalories()-dish2.getCalories());
	}

}
