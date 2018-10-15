/**
 * 
 */
package com.local.xmlparsers.sax;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author gaurav's
 *
 */
public class TestSAXParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		String file  = "C:\\Users\\gaurav's\\git\\JavaPractice\\src\\com\\local\\xmlparsers\\sax\\employee.xml";
	        try {
				SAXParser saxParser = saxParserFactory.newSAXParser();
				XmlEventHandler handler = new XmlEventHandler();
				saxParser.parse(new File(file), handler);
				List<Employee> empList = handler.getEmployeeList();
				System.out.println(empList);
			} catch (ParserConfigurationException |SAXException | IOException e) {
				System.out.println("Exception whil parsing the xml : "+e.getMessage());
			} 
	}

}
