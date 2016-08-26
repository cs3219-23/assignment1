import java.util.ArrayList;

public class Alphabetizer extends Filter {
	
	ArrayList<String> data = null;
	ArrayList<ArrayList<String>> sendData = new ArrayList<ArrayList<String>>();
	
	@Override
	void receive(ArrayList<ArrayList<String>> data) {
		// TODO Auto-generated method stub
		this.data = data.get(0);
		transform();
	}

	@Override
	void transform() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<data.size(); i++) {	
			if (Character.isUpperCase(data.get(i).charAt(0))) {
				continue;
			} else {
				String s = data.get(i).substring(0, 1).toUpperCase() + data.get(i).substring(1);
				data.set(i, s);
			}
		}
		sendData.add(data);
		forward();
	}

	@Override
	void forward() {
		// TODO Auto-generated method stub
		nextPipe.receive(sendData);
	}

}
