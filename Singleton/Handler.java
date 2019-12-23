package Singleton;


public class Handler {
	private static Handler Instance;
	private Handler() {
		
	}
	
	public static Handler getInstance() {
		if(Instance==null)
		{
			Instance = new Handler();
		}
		return Instance;
	}
	

}
