package SharedData;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class CircularShift {

	public static void shiftWords () {
		// Initialise storages and variables
		LineStorage lineStore = LineStorage.getInstance();
		IgnoreStorage ignoreStore = IgnoreStorage.getInstance();
		ArrayList<String> ignoredWords = ignoreStore.getAllLines();
		ArrayList<String> lines = new ArrayList<String>();
		
		// Shift the lines
		for (int i = 0; i < lineStore.size(); i++) {
			LinkedList<String> words = new LinkedList<String>(Arrays.asList(lineStore.getWords(i))); // Split the line into words
			
			// Shift the words
			for (int k = 0; k < words.size(); k++) {
				boolean validLine = true;
				
				// Check if the first word is an ignore word
				for (String ignoreWord : ignoredWords) {
					if (words.get(0).equalsIgnoreCase(ignoreWord)) {
						validLine = false;
						break;
					}
				}
				
				// Add the line if it is a valid line (1st word not ignore word)
				if (validLine) {
					String line = "";
					for (String word : words) {
						line += word + " ";
					}
					line = line.trim();
					lines.add(line);
				}
				
				// Shift the word
				words.add(words.poll());
			}
		}
		
		// Update the storage
		lineStore.removeAllLines();
		lineStore.addLines(lines);
	}
}
