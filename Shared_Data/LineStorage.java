public class LineStorage extends LinesStorage {
	private static LineStorage lineStore;
	
	private LineStorage(){
	}
	
	public static LineStorage getInstance(){
		if(lineStore == null){
			lineStore = new LineStorage();
		}
		return lineStore;
	}
	
	public String[] getWords(int index){
		return getLine(index).split("\\s+");
	}
	
}