package com.java8.streamsDemo.demoApps;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
public class FindUniqueCharsFromListOfStrings {
	public static void main(String[] args) {
		String stringArray[] = {"Nisha","Manisha","Manisha","Manpreet"};
		List<String> stringList = Arrays.asList(stringArray);
		/*List<String[]> resultList = stringList.stream().map(word -> word.split("")).distinct().collect(toList());
		for(String result[] : resultList) {
			System.out.println(result);
		}*/
		/*List<Stream<String>> resultList = stringList.stream().distinct().map(word -> word.split("")).map(Arrays :: stream).collect(toList());
		for(Stream<String> stream : resultList) {
			stream.forEach(System.out :: print);
			System.out.println();
		}*/
		/*stringList.stream().distinct().map(word -> {System.out.println(word);
		return word.split("");
		}).collect(toList());*/
		 List<String> result = stringList.stream().distinct().map(word -> word.split("")).flatMap(Arrays :: stream).distinct().collect(toList());
	}

	
}
