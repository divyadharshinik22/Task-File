package java_DOM_parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFile {
	
	private static final String FILENAME = "D:\\web development\\workspace\\XML\\sample.xml";

	public static void main(String[] args) {
		
		//1. Document Builder Factory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2. Document Builder
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
		//3. parse the xml file
			
			Document document = builder.parse(new File (FILENAME));
			
		//4. Get Root Element
			Element rootElement = document.getDocumentElement();
			
			System.out.println("RootElement = " + rootElement.getNodeName());
			
			String tagName = "book";
		//5. Node List
			NodeList nodeList = rootElement.getElementsByTagName(tagName);
			
			System.out.println("Total Nodes = " + nodeList.getLength());
			
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void getElementsByTagName(String tagName) {
		// TODO Auto-generated method stub
		
	}

}
