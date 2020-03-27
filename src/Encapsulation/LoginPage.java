package Encapsulation;

public class LoginPage {
	
	

	public static void main(String[] args) {
		
		//case 1: set the class vars with constructor:
		//Credentials cred = new Credentials("admin", "admin123");
//		
//		System.out.println(cred.getUsername());
//		System.out.println(cred.getPassword());
		
		//case 2 : set the class vars with setter:
		
		Credentials cred = new Credentials();
		
		cred.setUsername("naveen");
		cred.setPassword("naveen123");
		
		System.out.println(cred.getUsername());
		System.out.println(cred.getPassword());
		

	}

}
