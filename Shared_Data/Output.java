import java.util.ArrayList;

public class Output {
	
	public static void outputLines(){
		ResultStorage resultStore = ResultStorage.getInstance();
		ArrayList<String> lines = resultStore.getAllLines();
		
		for(String aLine : lines){
			System.out.println(aLine);
		}
	}
}
