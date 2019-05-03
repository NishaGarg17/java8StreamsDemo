package com.java8.streamsDemo.demoApps;

import java.util.Arrays;



public class FindItemsCountUsingStreams {

	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5,6,7,8};
		System.out.println("The count using inbuild count method is: " + Arrays.asList(array).stream().count());
		int count = Arrays.asList(array).stream().map(i -> 1).reduce(0, (a,b) -> a + b);
		System.out.println("The count is: " + count);
		
	}

}
