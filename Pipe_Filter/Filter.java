import java.util.ArrayList;

public abstract class Filter {
	
	Pipe nextPipe = null;
	
	public void setNextPipe(Pipe pipe) {
		nextPipe = pipe;
	}
	
	abstract void receive(ArrayList<ArrayList<String>> data);
	
	abstract void transform();
	
	abstract void forward();
}
