package java_DOM_parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Book {
	
	private static final String FILENAME = "D:\\web development\\workspace\\XML\\book.xml";

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
			
		//6. Iterate through the Node List and get Node element and attributes
			
			for(int i=0; i<nodeList.getLength();i ++) {
				
				Node node = nodeList.item(i);
				
				// check the node type
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					
					Element element = (Element)node;
					
					String id = element.getAttribute("id");
					
					System.out.println("Id = " + id);
					
					String author = element.getElementsByTagName("author").item(0).getTextContent();
					
					System.out.println("Author = " + author );
					
					String title = element.getElementsByTagName("title").item(0).getTextContent();
					
					System.out.println("Title =" + title);
					
					String genre = element.getElementsByTagName("genre").item(0).getTextContent();
					
					System.out.println("genre = " + genre);
					
					String price = element.getElementsByTagName("price").item(0).getTextContent();
					
					System.out.println("price = " + price);
					
					String publish_date = element.getElementsByTagName("publish_date").item(0).getTextContent();
					
					System.out.println("publish_date = " + publish_date);
	
					
					
					
				}
				
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void getElementsByTagName(String tagName) {
		// TODO Auto-generated method stub
		
	}

}
