package com.java8.streamsDemo.demoApps;

import java.util.Arrays;

public class StreamFindFirst {
	// given a list of numbers,
	// finds the first square that’s divisible by 3:

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5 };
		Arrays.asList(array).stream().map(x -> x * x).filter(x -> x % 3 == 0).findFirst()
				.ifPresent(System.out::println);
	}

}
