package com.lvl.effectiveJava.examples.builder.nutritionFacts;

public class NutritionFacts {

	public static final class NutritionFactsBuilder {

		private NutritionFacts instance = new NutritionFacts();

		public NutritionFactsBuilder(int servingSize, int servings) {
			instance.servingSize = servingSize;
			instance.servings = servings;
		}

		public NutritionFacts build() {
			// check here for fields consistency
			return instance;
		}

		public NutritionFactsBuilder withCalories(int calories) {
			instance.calories = calories;
			return this;
		}

		public NutritionFactsBuilder withCarbohydrate(int carbohydrate) {
			instance.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFactsBuilder withFat(int fat) {
			instance.fat = fat;
			return this;
		}

		public NutritionFactsBuilder withSodium(int sodium) {
			instance.sodium = sodium;
			return this;
		}

	}

	private int servingSize; // (mL) required
	private int servings; // (per container) required
	private int calories = 0; // (per serving) optional
	private int fat = 0; // (g/serving) optional

	private int sodium = 0; // (mg/serving) optional

	private int carbohydrate = 0; // (g/serving) optional

	private NutritionFacts() {
	}

	public int getCalories() {
		return calories;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public int getFat() {
		return fat;
	}

	public int getServings() {
		return servings;
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getSodium() {
		return sodium;
	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}

}
