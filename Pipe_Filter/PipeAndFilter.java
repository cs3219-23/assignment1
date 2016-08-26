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
		Filter capitalizerFilter = new Capitalizer();
		Pipe capitalizerPipe = new Pipe();
		Sink sink = new Sink();

		// setting the pipe-line
		pump.setNextPipe(pumpPipe);
		pumpPipe.setNextFilter(circularShiftFilter);
		circularShiftFilter.setNextPipe(circularShiftPipe);
		circularShiftPipe.setNextFilter(alphabetizerFilter);
		alphabetizerFilter.setNextPipe(alphabetizerPipe);
		alphabetizerPipe.setNextFilter(capitalizerFilter);
		capitalizerFilter.setNextPipe(capitalizerPipe);
		capitalizerPipe.setSink(sink);
		
		// feed in data and begin sequence
		pump.dataIn(args);
		pump.start();
	}

}
