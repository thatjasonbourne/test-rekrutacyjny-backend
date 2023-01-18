package pl.infinite.recruitment.tasks.task3;

import java.io.InputStream;

public interface IndexingHandler {
	void handle(InputStream content, DocumentIndexBuilder builder);

}
