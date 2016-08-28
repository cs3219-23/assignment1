import java.util.ArrayList;

public class Capitalizer {
	
	public static void capitalize() {
		LineStorage lineStore = LineStorage.getInstance();
		ArrayList<String> lines = lineStore.getAllLines();
		
		for (int i = 0; i<lines.size(); i++) {	
			if (Character.isUpperCase(lines.get(i).charAt(0))) {
				continue;
			} else {
				String s = lines.get(i).substring(0, 1).toUpperCase() + lines.get(i).substring(1);
				lines.set(i, s);
			}
		}
	}
	
}
