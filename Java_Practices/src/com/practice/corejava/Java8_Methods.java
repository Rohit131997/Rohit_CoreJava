package com.practice.corejava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Product1 {
	String name;
	double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Product1(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products List [name=" + name + ", price=" + price + "]";
	}
}

public class Java8_Methods {
	public static void main(String[] args) {

		List<Product1> productList = new ArrayList<Product1>();
		productList.add(new Product1("Redmi Mobile", 30000));
		productList.add(new Product1("Vivo Mobile", 30000));
		productList.add(new Product1("iPhone", 60000));
		productList.add(new Product1("Samsung Note10", 70001));
		productList.add(new Product1("OnePlus 6T", 38000));

		System.out.println(productList);

		/** anyMatch (checking to see if predicate matches atleast one) */

		boolean anyMatchStatus = productList.stream().anyMatch(list -> list.getPrice() == 60000);
		System.out.println("Any product with price 60000 :" + anyMatchStatus);

		/** allMatch (checking to see if predicate matches with all the elements) */

		boolean allMatchStatus = productList.stream().allMatch(list -> list.getPrice() >= 30000);
		System.out.println("If all the Product's price >=30000 :" + allMatchStatus);

		/**
		 * noneMatch, opposite of allMatch (checking to see if predicate matches with
		 * all the elements)
		 */
		boolean noneMatchStatus = productList.stream().noneMatch(list -> list.getPrice() >= 30000);
		System.out.println("If all the Product's price is >=30000 :" + noneMatchStatus);

		/**
		 * findAny : returns any of the matching element of the current stream
		 */
		Optional<Product1> productOptional = productList.stream().filter(product -> product.getPrice() >= 30000)
				.findAny();
		Product1 product = productOptional.orElseThrow(() -> new RuntimeException("No data exist"));
		System.out.println("Elements which are > 30000:" + product);

		/**
		 * findFirst : find the first element from the stream
		 */
		Optional<Product1> productOptional1 = productList.stream().filter(product1 -> product1.getPrice() > 30000)
				.findFirst();
		Product1 product1 = productOptional1.orElseThrow(() -> new RuntimeException("No data exist"));
		System.out.println("First element > 30000:" + product1);

		/** */

		/**
		 * Reducing operations. Summing all the elements
		 */
		double sum = productList.stream().map(Product1::getPrice).reduce(0.0, (p1, p2) -> (p1 + p2));
		System.out.println("Sum of all the prices: " + sum);

		/**
		 * Reducing operations. Multiplying all the elements
		 */
		double multiply = productList.stream().map(Product1::getPrice).reduce(1.0, (p1, p2) -> (p1 * p2));
		System.out.println("Multiplying all the prices: " + multiply);

		/**
		 * Reducers without initial value. Multiplying all the elements
		 */
		Optional<Double> sum1 = productList.stream().map(Product1::getPrice).reduce((p1, p2) -> (p1 + p2));
		System.out.println("Sum of all the prices with reducers(without initial value): " + sum1.orElse(0.0));

		/**
		 * Reducers using Double class Object
		 */
		Optional<Double> sumUsingDoubleClass = productList.stream().map(Product1::getPrice).reduce(Double::sum);
		System.out.println("Sum of all the prices using Double class Object: " + sumUsingDoubleClass.orElse(0.0));

		/**
		 * Getting the minimum value using Double class's min method
		 */
		Optional<Double> minValue = productList.stream().map(Product1::getPrice).reduce(Double::min);
		System.out.println("Getting the minimum value using Double class's min method: " + minValue.orElse(0.0));

		/**
		 * Getting the max value using Double class's max method
		 */
		Optional<Double> maxValue = productList.stream().map(Product1::getPrice).reduce(Double::max);
		System.out.println("Getting the maximum value using Double class's max method: " + maxValue.orElse(0.0));

		/**
		 * USING COLLECTORS
		 *
		 * Getting the count of even numbers from the product's prices
		 */
		double count = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.counting());
		System.out.println(count);

		/**
		 * Summing all the even numbers from the product's prices
		 */
		double sum2 = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.summingDouble(Product1::getPrice));
		System.out.println(sum2);

		/**
		 * Averaging all the even numbers from the product's prices
		 */
		double avg = productList.stream().filter(product2 -> product2.getPrice() % 2 == 0)
				.collect(Collectors.averagingDouble(Product1::getPrice));
		System.out.println(avg);

		/**
		 * Getting the MAX price from the product's prices
		 */
		Comparator<Product1> numComp = Comparator.comparingDouble(p -> p.getPrice());
		Optional<Product1> maxPrice = productList.stream().collect(Collectors.maxBy(numComp));
		System.out.println("MAX price from the product's list: " + maxPrice);
		/**
		 * Getting the MIN price from the product's prices
		 */
		Optional<Product1> minPrice = productList.stream().collect(Collectors.minBy(numComp));
		System.out.println("MIN price from the product's list: " + minPrice.orElse(product1));

		/**
		 * Summarizing
		 */
		DoubleSummaryStatistics statistics = productList.stream()
				.collect(Collectors.summarizingDouble(p -> p.getPrice()));

		System.out.println("MIN Statistics: " + statistics.getMin());
		System.out.println("MAX Statistics: " + statistics.getMax());

		// printing the list in descending order based on the price
		List<Product1> newList = productList.stream().sorted(
				(num1, num2) -> (num1.getPrice() < num2.getPrice()) ? 1 : (num1.getPrice() > num2.getPrice()) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println("List in descending order based on the price " + newList);

		// Get the second highest (already sorted above)
		System.out.println("Product with second highest price " + newList.get(1));

		// Get the product with second lowest price
		System.out.println("Product with second lowest price " + newList.get(newList.size() - 2));

		// String Joining without Separator
		String joiningOutput1 = productList.stream().map(p -> p.getName()).collect(Collectors.joining());
		System.out.println("Joining all the product names from the list without separator " + joiningOutput1);

		// String Joining with Separator
		String joiningOutput2 = productList.stream().map(p -> p.getName()).collect(Collectors.joining(", "));
		System.out.println("Joining all the product names from the list with separator " + joiningOutput2);

		// GROUP BY
		// Count of similar prices:
		Map<Object, Long> typeMapCount = productList.stream()
				.collect(Collectors.groupingBy(p -> p.getPrice(), Collectors.counting()));
		System.out.println("Count of similar objects: " + typeMapCount);

		// Summing objects of similar prices:
		Map<Object, Double> typeMapSumming = productList.stream()
				.collect(Collectors.groupingBy(p -> p.getPrice(), Collectors.summingDouble(p -> p.getPrice())));
		System.out.println("Summing objects of similar prices: " + typeMapSumming);

		// Collectors.partioningBy()
		Map<Boolean, List<Product1>> result = productList.stream()
				.collect(Collectors.partitioningBy(p -> p.getPrice() > 40000));
		System.out.println("Products with price>40K will come under true, Else, in false: " + result);

	}
}
