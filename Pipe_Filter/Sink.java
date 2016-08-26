import java.util.ArrayList;

public class Sink {
	
	ArrayList<String> data = null;
	
	public void receive(ArrayList<ArrayList<String>> data) {
		this.data = data.get(0);
		display();
	}
	
	public void display () {
		for (int i = 0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
	}
}
