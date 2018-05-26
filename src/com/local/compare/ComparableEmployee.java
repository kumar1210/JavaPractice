/**
 * 
 */
package com.local.compare;

import java.util.Comparator;

/**
 * @author gaurav's
 *
 */
public class ComparableEmployee implements Comparable<ComparableEmployee> {
	
	private int id;
	private long salary;
	private String name;
	

	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public ComparableEmployee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(ComparableEmployee obj) {

		return this.getId() - obj.getId();
	}
	
	@Override
	public String toString() {
		return "["+this.id+", "+this.name+", "+this.salary+"]";
	}
	
	public Comparator<ComparableEmployee> conditionalComp = new Comparator<ComparableEmployee>() {

		@Override
		public int compare(ComparableEmployee o1, ComparableEmployee o2) {

			return (int) (o1.getSalary()-o2.getSalary());
		}
		
	};

}
