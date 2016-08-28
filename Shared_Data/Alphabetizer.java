import java.util.Collections;

public class Alphabetizer {

	public static void alphabetize(){
		LineStorage lineStore = LineStorage.getInstance();
		
		Collections.sort(lineStore.getAllLines());
	}
}
