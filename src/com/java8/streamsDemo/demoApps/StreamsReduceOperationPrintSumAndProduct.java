package com.java8.streamsDemo.demoApps;

import java.util.Arrays;
import java.util.Optional;

public class StreamsReduceOperationPrintSumAndProduct {

	public static void main(String[] args) {
		// using reduce method of two args
		Integer[] array = {1,2,3,4,5};
		// int sum = Arrays.asList(array).stream().reduce(0, (a,b) -> a+b);
		int sum = Arrays.asList(array).stream().reduce(0, Integer :: sum);
		
		System.out.println("The sum is::: " + sum);
		int product = Arrays.asList(array).stream().reduce(1, (a,b) -> a*b);
		System.out.println("The Product is::: " + product);
		// using reduce method of one arg only
		Integer[] array1 = {1,2,3,4,5};
		Optional<Integer> sum1 = Arrays.asList(array1).stream().reduce(Integer :: sum);
		sum1.ifPresent(System.out :: println);
		
		
	}

}
