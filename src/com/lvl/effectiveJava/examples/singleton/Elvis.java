package com.lvl.effectiveJava.examples.singleton;

/**
 * Singleton with ENUM (preferred way)
 * Simpler than the public field approach and ironclad
 * guarantee of the singleton property.
 * 
 * Can't use it if the Singleton must extend a class other than Enum.
 * Interface implementation is possible, though.
 * 
 * @author LVL
 *
 */
public enum Elvis {
	
	INSTANCE;

	public void sing() {
		System.out.println("Elvis sings a beautiful song");
	}

}
