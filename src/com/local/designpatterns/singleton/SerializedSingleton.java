/**
 * 
 */
package com.local.designpatterns.singleton;

import java.io.Serializable;

/**
 * @author gaurav's
 *
 */
public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4881526513079112749L;

	private SerializedSingleton () {
		
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	static class SingletonHelper {
		
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}
	
	/****
	 * this method will help while deserializing the
	 * serialized value and will return the same instance
	 * @return
	 */
	protected Object readResolve() {
	    return getInstance();
	}
}
