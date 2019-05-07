package com.java8.streamsDemo.demoApps;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;

public class UseIntStream {

	public static void main(String[] args) {
		// if stream is empty default sum is 0
		int sum = MenuUtility.getMenu().getDishList().stream().mapToInt(Dish :: getCalories).sum();
		System.out.println("Sum is: " + sum);
		
		// convert intStream to Stream<Integer>
		IntStream intStream = MenuUtility.getMenu().getDishList().stream().mapToInt(Dish :: getCalories);
		Stream<Integer> stream = intStream.boxed();
		System.out.println(stream);

	}

}
