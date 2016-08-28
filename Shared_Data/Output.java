import java.util.ArrayList;

public class Output {
	
	public static void outputLines(){
		LineStorage lineStore = LineStorage.getInstance();
		ArrayList<String> lines = lineStore.getAllLines();
		
		for(String aLine : lines){
			System.out.println(aLine);
		}
	}
}
