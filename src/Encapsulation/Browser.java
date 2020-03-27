package Encapsulation;

public class Browser {
	
	private String name;
	private int version;
	
	public void launchBrowser(String browserName){
		interactWithOS(browserName);
		System.out.println("browser is launched " + browserName);
	}
	
	private void interactWithOS(String browserName){
		checkRAMSpace(browserName);
	}
	
	private void checkRAMSpace(String browserName){
		checkBrowserSetupFiles(browserName);
	}
	
	private void checkBrowserSetupFiles(String browserName){
		checkLatestVersion(browserName);
	}
	
	private void checkLatestVersion(String browserName){
		System.out.println("browser is found -- " + browserName);
	}
	
	
	

}
