import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CircularShift extends Filter {

	ArrayList<String> shiftedLines = new ArrayList<String>();

	@Override
	void transform() {
		ArrayList<String> lines = data.getData();
		ArrayList<String> ignoredWords = data.getIgnoredWords();
		
		// total number of lines
		for (int i = 0; i<lines.size(); i++) {
			String[] splited = lines.get(i).split("\\s+");
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(splited));
			
			// total number of words/shifts
			for (int k = 0; k<list.size(); k++) {
				list.add(list.get(0));
				list.remove(0);
				boolean validLine = true;
				
				// total number of ignored words
				for (int m = 0; m<ignoredWords.size(); m++) {
					if (list.get(0).equalsIgnoreCase(ignoredWords.get(m))) {
						validLine = false;
						break;
					}
				}
				
				// if valid line, add into a new array
				if (validLine) {
					String line = "";
					for (int l = 0; l<list.size(); l++) {
						line += list.get(l) + " ";
					}
					line = line.trim();
					shiftedLines.add(line);
				}
			}
		}
		
		Collections.sort(shiftedLines);
		data.setData(shiftedLines);
		forward();
	}

}
