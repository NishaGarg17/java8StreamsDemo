package com.java8.streamsDemo.demoApps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstStringLetterToUpperCaseWithStreams {

	public static void main(String[] args) {
		String[] stringsArray = { "nishan", "manishama", "parwinderpar", "manpreet" };
		String[] stringsArray1 = { "rohit", "mohit", "sahil" };

		List<String> stringsList1 = Arrays.asList(stringsArray);
		List<String> stringsList2 = Arrays.asList(stringsArray1);
		// working with one array only
		/*
		 * Arrays.asList(stringsArray).stream() .map(tempString -> new
		 * StringBuffer(tempString) .replace(0, 1,
		 * Character.toString(Character.toUpperCase(tempString.charAt(0)))))
		 * .forEach(System.out :: println);
		 */
		Stream.of(stringsList1,stringsList2).flatMap(list -> list.stream())
		.map(tempString -> new
		StringBuffer(tempString) .replace(0, 1,
		Character.toString(Character.toUpperCase(tempString.charAt(0))))).forEach(System.out :: println);
		
		// Stream.of(stringsList1,stringsList2).map(list -> list.stream());
	}

}
