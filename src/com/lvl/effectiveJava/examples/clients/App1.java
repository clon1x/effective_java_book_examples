package com.lvl.effectiveJava.examples.clients;

import com.lvl.effectiveJava.examples.builder.nutritionFacts.NutritionFacts;

public class App1 {

	public static void main(String[] args) {
		
		NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
		
		System.out.println(cocaCola);
	}

}
