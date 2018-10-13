package java8.features;

import java.util.stream.Stream;

import java8.features.util.ListProvider;

public class StreamAPIImpl {
	
	public static void main(String[] args) {
		ListProvider lp = new ListProvider();
		Stream<Integer> sequentialStream = lp.getlist().stream();
		Stream<Integer> parallelStream = lp.getlist().parallelStream();
		
		Stream<Integer> highNum = sequentialStream.filter(p -> p>90);
		highNum.forEach(p ->System.out.println("HighNum from Seq -->"+p));
		
		Stream<Integer> highNumPa = parallelStream.filter(p -> p>90);
		highNumPa.forEach(p -> System.out.println("HighNum from Parall--->"+p));
	}
	

}
