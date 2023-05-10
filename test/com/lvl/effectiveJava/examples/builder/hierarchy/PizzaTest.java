package com.lvl.effectiveJava.examples.builder.hierarchy;

import static com.lvl.effectiveJava.examples.builder.hierarchy.NyPizza.Size.SMALL;
import static com.lvl.effectiveJava.examples.builder.hierarchy.Pizza.Topping.HAM;
import static com.lvl.effectiveJava.examples.builder.hierarchy.Pizza.Topping.MUSHROOM;
import static com.lvl.effectiveJava.examples.builder.hierarchy.Pizza.Topping.ONION;
import static com.lvl.effectiveJava.examples.builder.hierarchy.Pizza.Topping.PEPPER;
import static com.lvl.effectiveJava.examples.builder.hierarchy.Pizza.Topping.SAUSAGE;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PizzaTest {

	@Test
	void should_ReturnNyPizza_When_NyPizzaBuilderInvoked() {
		
		// given
		NyPizza.Builder builder = new NyPizza.Builder(SMALL)
				.addTopping(SAUSAGE);
		
		// when
		Pizza pizza = builder.build();
		
		// then
		assertAll("Check NyPizza properties",
				() -> assertInstanceOf(NyPizza.class, pizza),
				() -> assertFalse(pizza.toppings.contains(HAM)),
				() -> assertFalse(pizza.toppings.contains(MUSHROOM)),
				() -> assertFalse(pizza.toppings.contains(ONION)),
				() -> assertFalse(pizza.toppings.contains(PEPPER)),
				() -> assertTrue(pizza.toppings.contains(SAUSAGE)),
				() -> assertTrue(((NyPizza) pizza).getSize() == SMALL)
				);
		
	}


	@Test
	void should_ReturnCalzone_When_CalzoneBuilderInvoked() {
		
		// given
		Calzone.Builder builder = new Calzone.Builder(true)
				.addTopping(MUSHROOM)
				.addTopping(ONION)
				.addTopping(SAUSAGE);
		
		// when
		Pizza pizza = builder.build();
		
		// then
		assertAll("Check NyPizza properties",
				() -> assertInstanceOf(Calzone.class, pizza),
				() -> assertFalse(pizza.toppings.contains(HAM)),
				() -> assertTrue(pizza.toppings.contains(MUSHROOM)),
				() -> assertTrue(pizza.toppings.contains(ONION)),
				() -> assertFalse(pizza.toppings.contains(PEPPER)),
				() -> assertTrue(pizza.toppings.contains(SAUSAGE)),
				() -> assertTrue(((Calzone) pizza).hasSauceInside())
				);
		
	}	
	
}
