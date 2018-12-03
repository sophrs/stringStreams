package stringStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringStreams {
	
	public static void main(String[] args) {
		
		List<String>introduction = Arrays.asList("Hello", "it's", "Dale!");
		
		String intro = introduction.stream().collect(Collectors.joining(" "));
		
		
		System.out.println(introduction);
		System.out.println(intro);
		
	}

}
