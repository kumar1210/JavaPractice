/**
 * 
 */
package com.local.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author gaurav's
 * 
 * @Retention = here retention explains, upto when the 
 * the value of the interface will be retained like runtime, 
 * compile time.
 *
 *@Target = shows the interface can be used on class level
 *or methods level.
 *
 */



@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SampleAnnotation {

	String author() default "Gaurav";
	String comment() ;
	String date();
}
