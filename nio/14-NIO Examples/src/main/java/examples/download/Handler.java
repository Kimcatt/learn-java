package examples.download;

import java.io.IOException;
import java.nio.channels.SelectionKey;

public interface Handler {
	
	void handle(SelectionKey key) throws IOException;
}
