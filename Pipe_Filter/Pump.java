import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pump {
	
	Pipe nextPipe = null;
	ArrayList<ArrayList<String>> data  = new ArrayList<ArrayList<String>>();
	
	public void setNextPipe(Pipe pipe) {
		nextPipe = pipe;
	}
	
	public void dataIn(String[] args) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> ignoredWords = new ArrayList<String>();
		
        if(args.length > 0) {
        	BufferedReader in;
			String text;
            File file = new File(args[0]);
    		if (file.exists()) {
    			in = new BufferedReader(new FileReader(args[0]));
    			while ((text = in.readLine()) != null) {
    				data.add(text);
    				System.out.println("Line : "+text);
    			}
    			in.close();
    		}
    		
            file = new File(args[1]);
    		if (file.exists()) {
    			in = new BufferedReader(new FileReader(args[1]));
    			while ((text = in.readLine()) != null) {
    				ignoredWords.add(text);
    				System.out.println("Ignored word : "+text);
    			}
    			in.close();
    		}
    		
            this.data.add(data);
            this.data.add(ignoredWords);
        }
       
	}
	
	public void start() {
		nextPipe.receive(data);
	}
	
}
