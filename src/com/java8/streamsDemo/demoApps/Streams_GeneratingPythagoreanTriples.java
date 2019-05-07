package com.java8.streamsDemo.demoApps;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams_GeneratingPythagoreanTriples {
	public static void main(String args[]) {
		// calculate pythagorean tuples using map
		Stream<int[]> pythagoreanTuples = IntStream.rangeClosed(1, 100).boxed().flatMap(a -> IntStream
				.rangeClosed(a, 100)
				.filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
				.boxed().map(b -> new int[] {a,b,(int)Math.sqrt(a*a + b*b)}));
		
	/*	pythagoreanTuples.forEach(array -> 
		System.out.println(array[0] + "," + array[1] + "," + array[2]));*/
		System.out.println("Ist way to find Total possible and valid tuples in between [1,100]: " + pythagoreanTuples.count());
		
		// calculate pythagorean tuples using mapToObj
		
		Stream<int[]> pythagoreanTuples1 = IntStream.rangeClosed(1, 100).boxed().flatMap(a -> IntStream.rangeClosed(a, 100)
				.filter(b -> Math.sqrt(a*a + b*b)%1 ==0 ).mapToObj(b -> new int[] {a, b, (int) Math.sqrt(a*a + b*b)}));
		System.out.println("2nd way to find Total possible and valid Tuples in between [1,100] are: " + pythagoreanTuples1.count());
		
		// Let's try somewhat better way
		
		Stream<double[]> pythagoreanTuples2 = IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100).mapToObj(b -> new double[] {a, b,  Math.sqrt(a*a + b*b)}).filter(array -> array[2] % 1 == 0));
		
		System.out.println("3rd way to find Total possible and valid Tuples in between [1,100] are: " + pythagoreanTuples2.count());

	}
	
}
