import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CircularShift extends Filter {

	ArrayList<String> newData = new ArrayList<String>();
	ArrayList<String> data = null;
	ArrayList<String> ignoredWords = null;
	ArrayList<ArrayList<String>> sendData = new ArrayList<ArrayList<String>>();
	
	@Override
	void receive(ArrayList<ArrayList<String>> data) {
		this.data = data.get(0);
		this.ignoredWords = data.get(1);
		transform();
	}

	@Override
	void transform() {
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
		sendData.add(newData);
		forward();
	}

	@Override
	void forward() {
		// TODO Auto-generated method stub
		nextPipe.receive(sendData);
	}
}
