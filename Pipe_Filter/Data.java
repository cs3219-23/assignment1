import java.util.ArrayList;

public class Data {
	
	ArrayList<String> data = new ArrayList<String>();
	ArrayList<String> ignoredWords = new ArrayList<String>();
	
	public ArrayList<String> getData() {
		return data;
	}
	
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	
	public ArrayList<String> getIgnoredWords() {
		return ignoredWords;
	}
	
	public void setIgnoredWords(ArrayList<String> ignoredWords) {
		this.ignoredWords = ignoredWords;
	}

	
}
