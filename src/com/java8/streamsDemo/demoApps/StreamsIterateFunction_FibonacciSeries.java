package com.java8.streamsDemo.demoApps;

import java.util.stream.Stream;

public class StreamsIterateFunction_FibonacciSeries {

	public static void main(String[] args) {
		Stream<int[]> fibonacciTuples = Stream.iterate(new int[] {0,1}, n -> new int[] {n[1],n[0]+n[1]}).limit(20);

		// fibonacciTuples.forEach(it -> System.out.println("(" + it[0] + "," + it[1] + ")"));
		fibonacciTuples.forEach(it -> System.out.println(it[1]));

	}

}
