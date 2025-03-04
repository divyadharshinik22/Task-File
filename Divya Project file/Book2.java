package java_DOM_parser;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class Book2 {
	
	private static final String FILENAME = "D:\\web development\\workspace\\XML\\Book(1).xml";

	public static void main(String[] args) {
		
		        try {
		            File xmlFile = new File("Book1.xml"); 
		            
		            // Your XML file
		            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		            DocumentBuilder builder = factory.newDocumentBuilder();
		            Document doc = builder.parse(xmlFile);
		            
		            doc.getDocumentElement().normalize();

		            // Get all book elements
		            NodeList bookList = doc.getElementsByTagName("book");

		            for (int i = 0; i < bookList.getLength(); i++) {
		                Node book = bookList.item(i);
		                if (book.getNodeType() == Node.ELEMENT_NODE) {
		                    Element bookElement = (Element) book;

		                    // Find book by id
		                    if (bookElement.getAttribute("id").equals("bk102")) { 
		                        NodeList prices = bookElement.getElementsByTagName("price");
		                        if (prices.getLength() > 0) {
		                            prices.item(0).setTextContent("10.99"); // Set new price
		                        }
		                    }
		                }
		            }

		            // Save changes to XML
		            TransformerFactory transformerFactory = TransformerFactory.newInstance();
		            Transformer transformer = transformerFactory.newTransformer();
		            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		            DOMSource source = new DOMSource(doc);
		            StreamResult result = new StreamResult(new File("Book1.xml"));
		            transformer.transform(source, result);

		            System.out.println("XML updated successfully!");

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

	public static String getFilename() {
		return FILENAME;
	}
		}

