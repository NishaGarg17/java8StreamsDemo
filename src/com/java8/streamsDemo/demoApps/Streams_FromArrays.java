package com.java8.streamsDemo.demoApps;

import java.util.Arrays;

public class Streams_FromArrays {

	public static void main(String[] args) {
		String[] array = new String[] {"Nisha","Mansiha","Isha","Rohit"};
		Arrays.stream(array).map(item -> item.toUpperCase()).forEach(System.out :: println);
	}

}
