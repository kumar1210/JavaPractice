/**
 * 
 */
package com.local.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author gaurav's
 *
 */
public class TransientDemo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String firstName;
    private transient String middleName;
    private String lastName;

    public TransientDemo (String fName, String mName, String lName){
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer(40);
        sb.append("First Name : ");
        sb.append(this.firstName);
        sb.append(" Middle Name : ");
        sb.append(this.middleName);
        sb.append(" Last Name : ");
        sb.append(this.lastName);
        return sb.toString();
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TransientDemo nameStore = new TransientDemo("Steve", "transient","Jobs");
		try {
	        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("nameStore"));
	        // writing to object
	        o.writeObject(nameStore);
	        o.close();
	        
	        ObjectInputStream in = new ObjectInputStream(new FileInputStream("nameStore"));
	        TransientDemo nameStore1 = (TransientDemo)in.readObject();
	        System.out.println(nameStore1);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
