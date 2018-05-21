/**
 * 
 */
package com.local.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author gaurav's
 *
 */
public class TestAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			for (Method method : TestAnnotation.class.getClassLoader().loadClass
					("com.local.annotations.AnnotationExample").getMethods()) {
				Annotation[] annotations = method.getAnnotations();
				for (Annotation annotation : annotations) {
					System.out.println(annotation);
				}
				if(method.isAnnotationPresent(SampleAnnotation.class)) {
					for (Annotation anno : method.getDeclaredAnnotations()) {
						System.out.println("Annotation in Method '" + method + "' : " + anno);
					}
					SampleAnnotation methodAnno = method.getAnnotation(SampleAnnotation.class);
					if(methodAnno.author().equals("Kumar")) {
						System.out.println("Method with author Kumar is : "+ method);
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
