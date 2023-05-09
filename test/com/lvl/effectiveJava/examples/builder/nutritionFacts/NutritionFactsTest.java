package com.lvl.effectiveJava.examples.builder.nutritionFacts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lvl.effectiveJava.examples.builder.nutritionFacts.NutritionFacts.NutritionFactsBuilder;

class NutritionFactsTest {

	@Test
	void should_ReturnNutritionFacts_When_BuildMethodIsUsed() {
		
		// given
		NutritionFactsBuilder builder = new NutritionFactsBuilder(10, 12);
		builder.withCalories(1);
		builder.withCarbohydrate(2);
		builder.withFat(3);
		
		// when
		NutritionFacts facts = builder.build();
		
		// then
		assertAll("Check values",
				() -> assertEquals(1, facts.getCalories(), "Calories"),
				() -> assertEquals(2, facts.getCarbohydrate(), "Carbohydrates"),
				() -> assertEquals(3, facts.getFat(), "Fat"),
				() -> assertEquals(12, facts.getServings(), "Servings"),
				() -> assertEquals(10, facts.getServingSize(), "Serving size"),
				() -> assertEquals(0, facts.getSodium(), "Sodium")
				);
	}
	
}
