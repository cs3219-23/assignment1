import java.io.IOException;

public class PipeAndFilter {

	public static void main(String[] args) throws IOException {
		
		// declaration of objects
		Pump pump = new Pump();
		Pipe pumpPipe = new Pipe();
		Filter circularShiftFilter = new CircularShift();
		Pipe circularShiftPipe = new Pipe();
		Filter alphabetizerFilter = new Alphabetizer();
		Pipe alphabetizerPipe = new Pipe();
		Sink sink = new Sink();

		// setting the pipe-line
		pump.setNextPipe(pumpPipe);
		pumpPipe.setNextFilter(circularShiftFilter);
		circularShiftFilter.setNextPipe(circularShiftPipe);
		circularShiftPipe.setNextFilter(alphabetizerFilter);
		alphabetizerFilter.setNextPipe(alphabetizerPipe);
		circularShiftPipe.setNextFilter(alphabetizerFilter);
		alphabetizerPipe.setSink(sink);
		
		// feed in data and begin sequence
		pump.dataIn(args);
		pump.start();
	}

}
