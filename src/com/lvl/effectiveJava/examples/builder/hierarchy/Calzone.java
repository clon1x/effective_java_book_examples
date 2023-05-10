package com.lvl.effectiveJava.examples.builder.hierarchy;

public class Calzone extends Pizza {

	private final boolean sauceInside;
	
	public static class Builder extends Pizza.Builder<Builder> {

		private boolean sauceInside = false;

		public Builder(boolean sauceInside) {
			this.sauceInside = sauceInside;
		}

		@Override
		public Pizza build() {
			return new Calzone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}
	
	
	private Calzone(Builder builder) {
		super(builder);
		sauceInside = builder.sauceInside;
	}

	public boolean hasSauceInside() {
		return sauceInside;
	}

	@Override
	public String toString() {
		return "NyPizza [sauceInside=" + sauceInside + ", toppings=" + toppings + "]";
	}

}
