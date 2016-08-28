package PipeAndFilter;

public class Pipe {
	
	Data data = null;
	Filter nextFilter = null;
	Sink sink = null;
	
	public void setNextFilter(Filter filter) {
		nextFilter = filter;
	}
	
	public void setSink(Sink sink) {
		this.sink = sink;
	}
	
	public void receive(Data data) {
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
