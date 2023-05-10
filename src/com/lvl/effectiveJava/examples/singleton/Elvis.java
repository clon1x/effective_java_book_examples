package com.lvl.effectiveJava.examples.singleton;

/**
 * Singleton with public final field
 * 
 * @author LVL
 *
 */
public class Elvis {
	
	public static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {}
	
	public void sing() {
		System.out.println("Elvis sings a beautiful song");
	}

}
