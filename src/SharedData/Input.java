package SharedData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {
	
	public static boolean initLineStorage(String lineFileName) throws IOException {
		return initStorage(lineFileName, LineStorage.getInstance());
	}
	
	public static boolean initIgnoreStorage(String ignoreFileName) throws IOException {
		return initStorage(ignoreFileName, IgnoreStorage.getInstance());
	}
	
	private static boolean initStorage(String filename, LinesStorage store) throws IOException {
		File file = new File(filename);
		
		if(file.exists()){
			BufferedReader in = new BufferedReader(new FileReader(filename));
			String line;
			
			while ((line = in.readLine()) != null) {
				store.addLine(line);
			}
			
			in.close();
			
			return true;
		} else {
			return false; // File not found
		}
	}

}
