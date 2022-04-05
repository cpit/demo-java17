package info.cpit.demo.java17;

import java.util.function.Function;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGenerator {
	
	public static void main (String ... args) {

		IntStream randomIntStream = RandomGeneratorFactory.of("Random")
		            .create()
		            .ints(600000, 1, 7);
		
		
		randomIntStream.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))//
		.entrySet().forEach(e -> System.out.println("Number "+e.getKey()+": "+e.getValue()+" times"));
		
	}

}
