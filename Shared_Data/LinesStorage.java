import java.util.ArrayList;

public class LinesStorage{
	
	private ArrayList<String> store;
	
	public LinesStorage(){
		store = new ArrayList<String>();
	}
	
	public void addLine(String line){
		store.add(line);
	}
	
	public void removeLine(String line){
		for(int i = 0; i < store.size(); i++){
			if(store.get(i).equals(line)){
				store.remove(i);
				return;
			}
		}
	}
	
	public String getLine(int index){
		return store.get(index);
	}
	
	public ArrayList<String> getAllLines(){
		return store;
	}
	
	public int size(){
		return store.size();
	}
}