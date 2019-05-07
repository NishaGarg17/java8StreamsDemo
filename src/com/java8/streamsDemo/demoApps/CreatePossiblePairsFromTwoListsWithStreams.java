package com.java8.streamsDemo.demoApps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
public class CreatePossiblePairsFromTwoListsWithStreams {

	public static void main(String[] args) {
		Integer[] numberArray1 = {1,2,3};
		Integer[] numberArray2 = {3,4};
		
		Stream<int[]> possiblePairs = Arrays.asList(numberArray1).stream().flatMap(i -> Arrays.asList(numberArray2).stream().map(j -> new int[] {i,j})).distinct();
		possiblePairs.forEach(array -> System.out.println("[" + array[0] + "," + array[1] + "]"));
		
		System.out.println("Pairs which are divisble by 3 are: ");
		Stream<int[]> possiblePairsDivisibleBy3 = Arrays.asList(numberArray1).stream()
		.flatMap(i -> Arrays.asList(numberArray2).stream().filter(j -> (i + j)%3 == 0).map(j -> new int[] {i, j}));
		possiblePairsDivisibleBy3.forEach(array -> System.out.println("[" + array[0] + "," + array[1] + "]"));
		
	}

}
