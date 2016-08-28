package SharedData;
public class IgnoreStorage extends LinesStorage {
	private static IgnoreStorage ignoreStore;
	
	private IgnoreStorage(){
	}
	
	public static IgnoreStorage getInstance(){
		if(ignoreStore == null){
			ignoreStore = new IgnoreStorage();
		}
		return ignoreStore;
	}
}