package java8_18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> biconsumer = (t,u) -> System.out.println(t + u);
		biconsumer.accept("java", "8");
		
		DoubleConsumer doubleconsumer = d -> System.out.println("Java" + d);
		doubleconsumer.accept(8.0);
		
		ObjIntConsumer<String> objintconsumer = (t,i) -> System.out.println(t + "8");
		objintconsumer.accept("java", 8);
	}

}
