package ch17.sec01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapMain {
	public static void main(String[] args) {
		int [] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(d->System.out.println(d));
		
	}
}
