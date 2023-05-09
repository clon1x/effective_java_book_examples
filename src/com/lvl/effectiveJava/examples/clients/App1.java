package com.lvl.effectiveJava.examples.clients;

import com.lvl.effectiveJava.examples.builder.nutritionFacts.NutritionFacts;

public class App1 {

	public static void main(String[] args) {
		
		NutritionFacts cocaCola = new NutritionFacts();
		
		cocaCola.setServingSize(240);
		cocaCola.setServings(8);
		cocaCola.setCalories(100);
		cocaCola.setSodium(35);
		cocaCola.setCarbohydrate(27);
		
		System.out.println(cocaCola);
	}

}
