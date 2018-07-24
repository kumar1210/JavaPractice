/**
 * 
 */
package com.local.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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
    private transient final String middleName;
    private String lastName;
    private Map<String, Integer> map; 

    public TransientDemo (String fName, String mName, String lName){
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.map = new HashMap<String, Integer>();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer(40);
        sb.append("First Name : ")
        .append(this.firstName)
        .append(" Middle Name : ")
        .append(this.middleName)
        .append(" Last Name : ")
        .append(this.lastName)
        .append(" Map Details : ")
        .append(map);
        return sb.toString();
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TransientDemo nameStore = new TransientDemo("Steve", "transient","Jobs");
		nameStore.map.put("Steve ", 10000);
		System.out.println(nameStore);
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
