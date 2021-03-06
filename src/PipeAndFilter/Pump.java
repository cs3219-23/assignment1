package PipeAndFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pump {
	
	Pipe nextPipe = null;
	Data data = new Data();
	
	public void setNextPipe(Pipe pipe) {
		nextPipe = pipe;
	}
	
	public void dataIn(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<String>();
		ArrayList<String> ignoredWords = new ArrayList<String>();
		
        	BufferedReader in;
			String text;
            File file = new File(args[0]);
    		if (file.exists()) {
    			in = new BufferedReader(new FileReader(args[0]));
    			while ((text = in.readLine()) != null) {
    				lines.add(text);
    			}
    			in.close();
    		} else {
    			System.out.println("Word file '" + args[0] + "' not found");
    			System.exit(0);
    		}
    		
            file = new File(args[1]);
    		if (file.exists()) {
    			in = new BufferedReader(new FileReader(args[1]));
    			while ((text = in.readLine()) != null) {
    				ignoredWords.add(text);
    			}
    			in.close();
    		}  else {
    			System.out.println("Ignore file '" + args[1] + "' not found");
    			System.exit(0);
    		}
    		
    		data.setData(lines);
    		data.setIgnoredWords(ignoredWords);

	}
	
	public void start() {
		nextPipe.receive(data);
	}
	
}
