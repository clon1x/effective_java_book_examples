package com.lvl.effectiveJava.examples.singleton;

import java.io.Serializable;

/**
 * Singleton with public final field
 * 
 * @author LVL
 *
 */
public class Elvis implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1300973988232000629L;
	private static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {}
	
	public static Elvis getInstance() {
		return Elvis.INSTANCE;
	}

	public void sing() {
		System.out.println("Elvis sings a beautiful song");
	}
	
	/**
	 * Implement readResolve to preserve Singleton property on deserialization.
	 * Return the true and only instance and let the garbage collector take 
	 * care of this object.
	 * 
	 * @return The singleton Instance.
	 */
	private Object readResolve() {
		return INSTANCE;
	}

}
