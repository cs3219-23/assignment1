import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CircularShift {

	ArrayList<String> newData = new ArrayList<String>();
	
	public void shift (ArrayList<String> data, ArrayList<String> ignoredWords) {
		
		// total number of lines
		for (int i = 0; i<data.size(); i++) {
			String[] splited = data.get(i).split("\\s+");
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
					System.out.println("Line is : "+line);
					newData.add(line);
				}
			}
		}
		
		Collections.sort(newData);
	}
}
