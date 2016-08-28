package PipeAndFilter;

public abstract class Filter {
	
	Pipe nextPipe = null;
	Data data = null;
	
	public void setNextPipe(Pipe pipe) {
		nextPipe = pipe;
	}
	
	public void receive(Data data) {
		this.data = data;
		transform();
	}
	
	public void forward() {
		nextPipe.receive(data);
	}

	abstract void transform();	

}
