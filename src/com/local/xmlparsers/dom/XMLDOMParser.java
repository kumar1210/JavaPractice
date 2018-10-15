/**
 * 
 */
package com.local.xmlparsers.dom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author gaurav's
 *
 */
public class XMLDOMParser {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws TransformerException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {

		String xmlFile = "C:\\Users\\gaurav's\\git\\JavaPractice\\src\\com\\local\\xmlparsers\\dom\\School.xml";
		File file = new File(xmlFile);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = builderFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);	
		doc.getDocumentElement().normalize();
		System.out.println("Root Element : "+doc.getDocumentElement().getNodeName());
		readXMLFile(doc);
		writeXMLFile(doc);
	}
	
	
	private static void writeXMLFile(Document doc) throws TransformerException {

		doc.getDocumentElement().normalize();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("employee_updated.xml"));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);
        System.out.println("XML file updated and created successfully");
	}


	private static void readXMLFile(Document doc) {
		
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("Section");
		List<Student> studentsList = null;
		Map<String, List<Student>> studentRecord = new HashMap<>();
		Node name = null;
		for(int i =0; i<nodeList.getLength();i++) {
			Node node = nodeList.item(i);
			//System.out.println(node.getNodeType());
			Element ele = (Element) node;
			String sectionName = ele.getElementsByTagName("Name").item(0).getTextContent();
			NodeList studentsNode = ele.getElementsByTagName("Student");
			studentsList = new ArrayList<>();
			for(int j=0; j<studentsNode.getLength();j++) {
				name = ((Element)studentsNode.item(j));
				studentsList.add(new Student(name.getTextContent()));
				//This line will update the existing xml, here we are just converting the students
				//name from lowercase to uppercase.
				name.setTextContent(name.getTextContent().toUpperCase());
			}
			studentRecord.put(sectionName, studentsList);
		}
		System.out.println(studentRecord);
	}

}
