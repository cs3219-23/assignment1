package SharedData;
import java.io.IOException;

public class Master{
	
	public Master(String[] args) {
		// Check arguments
		if(args.length < 2){
			System.out.println("Usage: Master <word file path> <ignore word file path>");
			return;
		}
		
		// Read lines from files, initialise Storage
		if(!initFileStorage(args[0], args[1])){
			return;
		}
		
		// Process the lines
		CircularShift.shiftWords(); // Shift words
		Alphabetizer.alphabetize(); // Sort the words
		Capitalizer.capitalize(); // Capitalize the first character
		
		// Output the lines
		Output.outputLines();
	}

	private static boolean initFileStorage(String lineFileName, String ignoreFileName){
		try{
			if(!Input.initLineStorage(lineFileName)){
				System.err.println("Word file '" + lineFileName + "' not found");
				return false;
			}
			if(!Input.initIgnoreStorage(ignoreFileName)){
				System.err.println("Ignore file '" + ignoreFileName + "' not found");
				return false;
			}
		} catch (IOException e){
			System.err.println("An error occured when reading a file.");
			System.err.println(e.getMessage());
			return false;
		}
		
		return true;
	}
}