package java8.features;

import java.util.function.Consumer;

import java8.features.util.ListProvider;

public class ForEachLoopInIterator {

	public static void main(String[] args) {
		ListProvider lp = new ListProvider();
		MyConsumer action = new MyConsumer();
		lp.getlist().forEach(action);
		
		lp.getlist().forEach(new Consumer<Integer>() {
			
			public void accept(Integer t) {
				System.out.println("From ananomous inner class-->" +t );
			}
		});
		
		
	}
}

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
}