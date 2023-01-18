package pl.infinite.recruitment.tasks.task3;

import java.io.InputStream;

/**
 * This class extracts text from xml files. Xml file is passed as {@code InputStream} to method {@code handle()}.
 * Extracted text must be passed to {@code DocumentIndexBuilder}
 */
public class XmlTextExtractingHandler implements IndexingHandler {

	@Override
	public void handle(InputStream content, DocumentIndexBuilder builder) {
		// TODO
	}
}
