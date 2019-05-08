package com.java8.streamsDemo.demoApps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Streams_FromFiles {

	public static void main(String[] args) {
		try {
			Stream<String> stream1 = Files.lines(Paths.get("D://Docs//Important Docs//SaveFiltersCommand.txt")).flatMap(line -> Arrays.stream(line.split("")));
			Stream<String> stream = Files.lines(Paths.get("D://Docs//Important Docs//SaveFiltersCommand.txt")).map(line -> line.split("")).flatMap(Arrays :: stream);
			stream.distinct().forEach(System.out :: print);
		} catch(IOException ex) {
			
		}

	}

}
