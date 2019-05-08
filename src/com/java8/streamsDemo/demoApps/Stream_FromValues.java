package com.java8.streamsDemo.demoApps;

import java.util.stream.Stream;

public class Stream_FromValues {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Nisha","Garg","Manisha","GArg","Isha","Garg");
		stream.distinct().forEach(System.out :: println);
		

	}

}
