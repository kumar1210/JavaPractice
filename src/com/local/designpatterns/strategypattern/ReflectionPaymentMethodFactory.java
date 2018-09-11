/**
 * 
 */
package com.local.designpatterns.strategypattern;

/**
 * @author gaurav's
 *
 */
public class ReflectionPaymentMethodFactory {

	public static PaymentMethod getPaymentMethod(String className){
		
		PaymentMethod payment = null;
		try {
			Class<?> clazz = Class.forName(className);
			payment = (PaymentMethod) clazz.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return payment;
	}
}
