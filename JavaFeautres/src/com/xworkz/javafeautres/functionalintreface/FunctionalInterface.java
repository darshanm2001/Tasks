package com.xworkz.javafeautres.functionalintreface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;

public interface FunctionalInterface {
	
	public static void main(String[] args) {

		System.out.println("BiConsumer");
		BiConsumer<String, String> 
		cricket = (s1, s2) -> {
			System.out.println("Name :" + s1);
			System.out.println("Name :" + s2);
		};
		cricket.accept("M S Dhoni", "Yuvaraj Singh");

		System.out.println("\nBiPredicate");
		BiPredicate<String, String> 
		guess = (a, b) -> {

			if (a.equals("Win"))
				System.out.println("India :" + a);
			else
				System.err.println("India :" + b);
			return true;
		};

		guess.test("Win", "Loose");

		System.out.println("\nBooleanSupplier");
		BooleanSupplier supply = () -> {

			return false;
		};

		System.out.println(supply.getAsBoolean());

		System.out.println("\nConsumer");
		Consumer<Double> 
		consumer = (d) -> {
			if (d >= 25000.0d)
				System.out.println(d + " Valid price");
			else
				System.err.println(d + " Invalid price");

		};

		consumer.accept(26000.0d);

		System.out.println("\nDoubleBinaryOperator");
		DoubleBinaryOperator binaryOperator = (d1, d2) -> {
			if (d1 == d2)
				System.out.println("Original Price");
			else
				System.err.println("Duplicate Price");
			return d1;
		};

		binaryOperator.applyAsDouble(2000.0, 3000.0);

		System.out.println("\nDoubleConsumer");
		DoubleConsumer doubleConsumer = (d) -> {
			if (d >= 3000d)
				System.out.println(d + " Valid amount");
			else
				System.out.println(d + " Invalid amount");
		};
		doubleConsumer.accept(3200d);

		System.out.println("\nDoubleFunction");
		DoubleFunction<Double> doubleFunction = (d1) -> {
			if (d1 != 0)
				System.out.println(d1);
			else
				System.err.println("0");
			return d1;
		};
		doubleFunction.apply(0);

		System.out.println("\nBinaryOperator");
		BinaryOperator<Integer> valid = (i1, i2) -> {

			if (i1.equals(i2))
				System.out.println(i1);
			else
				throw new NullPointerException();

			return 0;
		};

		valid.apply(2300, 2300);

		System.out.println("\nDoublePredicat");
		DoublePredicate doublePredicate = (d) -> {

			if (d != 0)
				System.out.println(d);
			else
				System.err.println("0");

			return false;
		};

		doublePredicate.test(23000);
	}

}
