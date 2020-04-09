package java8_19;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		Function<String, Member_2> function1 = Member_2 :: new;
		Member_2 member1 = function1.apply("angel");
		
		BiFunction<String, String, Member_2> function2 = Member_2 :: new;
		Member_2 member2 = function2.apply("Ω≈√µªÁ", "angel");

	}

}
