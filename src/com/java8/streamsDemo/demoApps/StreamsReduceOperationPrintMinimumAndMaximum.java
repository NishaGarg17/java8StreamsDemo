package com.java8.streamsDemo.demoApps;

import java.util.Arrays;
import java.util.Optional;

public class StreamsReduceOperationPrintMinimumAndMaximum {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,4,5};
		
		// print the minimum value from the list
		Optional<Integer> minimum = Arrays.asList(array).stream().reduce(Integer :: min);
		minimum.ifPresent(System.out :: println);
		// print the maximum value from the list
		Optional<Integer> maximum = Arrays.asList(array).stream().reduce(Integer :: max);
		maximum.ifPresent(System.out :: println);
		
		// print the minimum and maximum values
		Optional<Integer> min = Arrays.asList(array).stream().reduce((a,b)-> (a>b) ? a : b);
		min.ifPresent(System.out :: println);
		Optional<Integer> max = Arrays.asList(array).stream().reduce((a,b)-> (a<b) ? a : b);
		max.ifPresent(System.out :: println);
	}

}
