public class ResultStorage extends LinesStorage {
	private static ResultStorage resultStore;
	
	private ResultStorage(){
	}
	
	public static ResultStorage getInstance(){
		if(resultStore == null){
			resultStore = new ResultStorage();
		}
		return resultStore;
	}
	
}