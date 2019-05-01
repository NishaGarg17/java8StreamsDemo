package com.java8.streamsDemo.demoApps;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
public class CreatePossiblePairsAndSumDivisibleBy3WithStreams {

	public static void main(String[] args) {
		Integer[] numberArray1 = {1,2,3};
		Integer[] numberArray2 = {3,4};
		
	/*	List<int[]> possiblePairArrayList = Arrays.asList(numberArray1).stream().flatMap(i -> Arrays.asList(numberArray2)
	 * .stream().filter(j -> (i+j) % 3 == 0)
	 * .map(j -> new int[] {i,j})).collect(toList());*/
		
/*		List<int[]> possiblePairArrayList = Arrays.asList(numberArray1).stream()
				.flatMap(i -> Arrays.asList(numberArray2).stream()
				.map(j -> new int[] {i,j})).filter(array -> (array[0] + array[1] ) % 3 == 0).collect(toList());*/
		
		List<int[]> possiblePairArrayList = Arrays.asList(numberArray1).stream()
				.flatMap(i -> Arrays.asList(numberArray2).stream()
				.map(j -> new int[] {i,j}).filter(array -> (array[0] + array[1] ) % 3 == 0)).collect(toList());
		
		for(int[] array : possiblePairArrayList) {
			for(int item : array) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}

}
