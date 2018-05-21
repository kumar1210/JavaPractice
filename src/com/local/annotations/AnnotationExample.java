/**
 * 
 */
package com.local.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaurav's
 *
 */
public class AnnotationExample {

	
	@Override
	@SampleAnnotation(comment = "Override toString Method", date = "20th May, 2018")
	public String toString() {
		
		return "Overriden String Method";
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SampleAnnotation(author= "Kumar", comment = "generics Test", date = "19th May, 2018")
	public static void genericsTest()  {
		List l = new ArrayList();
		l.add("abc");
	}
}
