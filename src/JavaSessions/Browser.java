package JavaSessions;

import java.util.ArrayList;

//2. Design a browser class template with the following features:
////class variables:
//browserName
//vendorName
//currentVersion
//List of plugins supported by Browser in Array List<String>
//
//--Design the constructor of this class with different parameters and all parameters.
//--Call the constructors with object reference name


public class Browser {

	public String browserName ;
	public String vendorName ;
	public float currentVersion ;
	public ArrayList<String> pluginList ;
	
	public Browser (String browserName, String vendorName, float currentVersion, ArrayList<String> pluginList){
		this.browserName = browserName ;
		this.vendorName = vendorName ;
		this.currentVersion = currentVersion ;
		this.pluginList = pluginList ;
	}		
	public static void main(String[] args) {
	ArrayList<String> pluginChrome = new ArrayList<String>() ;
		pluginChrome.add("Adobe Flash");
		pluginChrome.add("DRM");
		pluginChrome.add("PDF Reader");
		pluginChrome.add("Civil");
		
		ArrayList<String> oldPluginFirefox = new ArrayList<String>();
		oldPluginFirefox.add("Firebug");
		oldPluginFirefox.add("FirePath");
		oldPluginFirefox.add("Greasemonk");
		oldPluginFirefox.add("LastPass");
		
ArrayList<String> pluginIE = new ArrayList<String>() ;
		pluginIE.add("McAfee WebAdvisor");
		pluginIE.add("XML DOM Document");
		pluginIE.add("Java(tm) Plugin");
	    
    Browser b1 = new Browser("Chrome", "Google", 80.0f, pluginChrome);
    Browser b2 = new Browser("Firefox", "Mozilla", 73.0f, oldPluginFirefox);
    Browser b3 = new Browser("IE","Microsoft", 11.1098f, pluginIE);
    System.out.println(b1.browserName + " " + b1.vendorName + "  " + b1.currentVersion + " " +  b1.pluginList );   
    System.out.println(b2.browserName + " " + b2.vendorName + "  " + b2.currentVersion + " " +  b2.pluginList);		
    System.out.println(b3.browserName + " " + b3.vendorName + "  " + b3.currentVersion + " " +  b2.pluginList);		

		
		
		
	}

}
