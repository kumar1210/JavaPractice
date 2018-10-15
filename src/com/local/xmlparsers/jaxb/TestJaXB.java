/**
 * 
 */
package com.local.xmlparsers.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author gaurav's
 *
 */
public class TestJaXB {
	
	private static File file = new File("C:\\Users\\gaurav's\\git\\JavaPractice\\src\\com\\local\\xmlparsers\\jaxb\\employees.xml");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		convertObjectToXML();
		convertXMLToObject();
	}
	
	public static void convertObjectToXML() {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setAge(27);
		emp.setName("Gaurav");
		emp.setGender("Male");
		emp.setRole("Developer");
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setAge(29);
		emp1.setName("Deepty");
		emp1.setGender("Female");
		emp1.setRole("HR");
		
		Employees emps = new Employees();
		emps.getEmp().add(emp);
		emps.getEmp().add(emp1);
		System.out.println(emps);
		try {
			JAXBContext context = JAXBContext.newInstance(Employees.class);
			Marshaller marshal = context.createMarshaller();
			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshal.marshal(emps, System.out);
			marshal.marshal(emps, file);
		} catch (JAXBException e) {
			System.out.println(e.getErrorCode() + " "+ e.getMessage());
		}
	}

	
	public static void convertXMLToObject() {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Employees.class);
			Unmarshaller unMarshal = context.createUnmarshaller();
			Employees emps = (Employees) unMarshal.unmarshal(file);
			System.out.println(emps);
		} catch (JAXBException e) {
			System.out.println(e.getErrorCode() + " "+ e.getMessage());
		}
	}
}
