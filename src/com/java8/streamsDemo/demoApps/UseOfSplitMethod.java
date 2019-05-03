package com.java8.streamsDemo.demoApps;

public class UseOfSplitMethod {

	public static void main(String[] args) {
		String string = "Passport_2.5_System_Requirements.pdf";
		String[] stringSplit = string.split("\\.");
		System.out.println(string.split("\\."));
		System.out.println(stringSplit.length);
		System.out.println(stringSplit[stringSplit.length-1]);
		for(String temp : stringSplit) {
			System.out.println(temp);
		}

	}

}
