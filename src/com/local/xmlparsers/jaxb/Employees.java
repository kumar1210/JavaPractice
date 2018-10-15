/**
 * 
 */
package com.local.xmlparsers.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gaurav's
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {
	
	@XmlElement
	private List<Employee> emp = new ArrayList<>();

	/**
	 * @return the emp
	 */
	public List<Employee> getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
	public String toString() {
		return emp.toString();
	}

}
