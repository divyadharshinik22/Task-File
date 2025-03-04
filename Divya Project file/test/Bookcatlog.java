package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Bookcatlog {
	
	private static final String FILENAME = "D:\\web development\\workspace\\XML\\Bookcatlog.xml";
	private static Document document;
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//1. Document Builder Factory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2. Document Builder
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
		//3. parse the xml file
			
			document = builder.parse(new File(FILENAME));
			
		//4. Get Root Element
			
			Element rootElement = document.getDocumentElement();
			
			System.out.println("RootElement = " + rootElement.getNodeName());
			
			String tagname = "book";
			
		//5. Node List
			
			NodeList nodeList = rootElement.getElementsByTagName(tagname);
			
			System.out.println("Total Nodes = " + nodeList.getLength());
	    
        //7. Iterate through the Node List and get Node element and attributes
			
			for(int i=0; i<nodeList.getLength();i ++) {
				
				Node node = nodeList.item(i);
				
				// check the node type
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					
					Element element = (Element)node;
					
					String id = element.getAttribute("id");
					element.setAttribute("id", String.valueOf(i + 100));
					System.out.println("Id = " + element.getAttribute("id"));
				
					String author = element.getElementsByTagName("author").item(0).getTextContent();
					
					System.out.println("Author = " + author );
					
                    Node newNode = element.getElementsByTagName("title").item(0);
                    String title = newNode.getTextContent();
                    
					
					System.out.println("Title = " + newNode.getTextContent());
					
					String genre = element.getElementsByTagName("genre").item(0).getTextContent();
					
					System.out.println("genre = " + genre);
					
					
					//Scanner scanner = new Scanner(System.in);
					//String price = scanner.nextLine();
					Node priceElement = null;
					//priceElement.setNodeValue(price);
					
				    String publish_date = element.getAttribute("publish_date");
				    
				    element.setAttribute("publish_date", "10-01-2025");
				    System.out.println("publish_date = " + element.getAttribute("publish_date"));
				    
				    String language = element.getAttribute("language");
				    element.setAttribute("language", "English");
				    System.out.println("language = " + element.getAttribute("language"));
				    
				    String price = element.getAttribute("price");
				    System.out.println("price = " + price);
				    int priceInt = Integer.parseInt(price)*2;
				    element.setAttribute("price",String.valueOf(priceInt) );
				    System.out.println("price = " + price);
				    
					
				}
				
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	private static void getElementsByTagName(String filename) {
		// TODO Auto-generated method stub
		
	}


	public static String getFilename() {
		return FILENAME;
	}

}
