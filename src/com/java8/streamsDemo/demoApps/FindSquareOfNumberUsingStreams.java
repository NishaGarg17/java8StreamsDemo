package com.java8.streamsDemo.demoApps;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
public class FindSquareOfNumberUsingStreams {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		List<Integer> intArrayList = Arrays.asList(intArray);
		List<Integer> resultList = intArrayList.stream().map(temp -> temp*temp).collect(toList());
		for(int i=0; i< intArray.length; i++) {
			System.out.println(intArray[i] + "-->" + resultList.get(i));
		}
	}

}
