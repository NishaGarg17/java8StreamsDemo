package com.java8.streamsDemo.demoApps;

import java.util.stream.IntStream;

public class Streams_NumericRanges {

	public static void main(String[] args) {
		IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(n -> n%2 == 0); // range is inclusive
		System.out.println("Even numbers from 1 to 100 using rangeClosed method are: " + evenNumbers.count());
		
		IntStream evens = IntStream.range(1, 100).filter(n -> n%2 == 0); // start inclusive and end exclusive
		System.out.println("Even numbers from 1 to 100 using range method are: " + evens.count());

	}

}
