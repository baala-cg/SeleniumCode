package JavaSessions;

public interface Commerce {
	
	public void economics();
	 
	public void mathematics();
	
	//allowed from Java 1.8 only
	public static void tax() {
		System.out.println("Commerce - Tax");
	}
	
	//allowed from Java 1.8 only
	//default method
	default void accounts() {
		System.out.println("Default - Accounts");
	}
	
}
