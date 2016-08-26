import java.util.Collections;

public class Alphabetizer {

	public static void alphabetize(){
		ResultStorage resultStore = ResultStorage.getInstance();
		
		Collections.sort(resultStore.getAllLines());
	}
}
