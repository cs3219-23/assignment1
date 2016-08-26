import java.util.ArrayList;

public class Pipe {
	ArrayList<ArrayList<String>> data = null;
	Filter nextFilter = null;
	Sink sink = null;
	
	public void setNextFilter(Filter filter) {
		nextFilter = filter;
	}
	
	public void setSink(Sink sink) {
		this.sink = sink;
	}
	
	public void receive(ArrayList<ArrayList<String>> data) {
		this.data = data;
		forward();
	}

	
	public void forward() {
		if (sink==null) {
			nextFilter.receive(data);
		} else {
			sink.receive(data);
		}
	}
}
