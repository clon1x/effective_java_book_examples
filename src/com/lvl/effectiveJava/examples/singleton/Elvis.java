package com.lvl.effectiveJava.examples.singleton;

/**
 * Singleton with public final field
 * 
 * @author LVL
 *
 */
public class Elvis {
	
	private static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {}
	
	public static Elvis getInstance() {
		return Elvis.INSTANCE;
	}

	public void sing() {
		System.out.println("Elvis sings a beautiful song");
	}

}
