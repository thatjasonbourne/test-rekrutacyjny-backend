package pl.infinite.recruitment.tasks.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * This class extracts text from xml files. Xml file is passed as {@code InputStream} to method {@code handle()}.
 * Extracted text must be passed to {@code DocumentIndexBuilder}
 */
public class XmlTextExtractingHandler implements IndexingHandler {

	private final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

	@Override
	public void handle(InputStream content, DocumentIndexBuilder builder) {
		try {
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document doc = documentBuilder.parse(content);
			readRecursively(doc, builder);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void readRecursively(Node node, DocumentIndexBuilder builder) {
		if (node.getNodeType() == Node.TEXT_NODE && !node.getTextContent().trim().isBlank()) {
			builder.addText(node.getTextContent());
		} else {
			NodeList children = node.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				readRecursively(children.item(i), builder);
			}
		}
	}
}
