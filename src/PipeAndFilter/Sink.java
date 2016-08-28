package PipeAndFilter;

public class Sink {
	
	Data data = null;
	
	public void receive(Data data) {
		this.data = data;
		display();
	}
	
	public void display () {
		for (int i = 0; i<data.getData().size(); i++) {
			System.out.println(data.getData().get(i));
		}
	}
}
