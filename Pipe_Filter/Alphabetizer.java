import java.util.Collections;

public class Alphabetizer extends Filter {

	@Override
	void transform() {
		Collections.sort(data.getData());
		forward();
	}

}
