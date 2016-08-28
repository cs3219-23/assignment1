package SharedData;
import java.util.ArrayList;
import java.util.List;

public class LinesStorage{
	
	private ArrayList<String> store;
	
	public LinesStorage(){
		store = new ArrayList<String>();
	}
	
	public void addLine(String line){
		store.add(line);
	}
	
	public boolean addLines(List<String> lines){
		return store.addAll(lines);
	}
	
	public void removeLine(String line){
		for(int i = 0; i < store.size(); i++){
			if(store.get(i).equals(line)){
				store.remove(i);
				return;
			}
		}
	}
	
	public void removeLine(int index){
		store.remove(index);
	}
	
	public void removeAllLines(){
		store.clear();
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