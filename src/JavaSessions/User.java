package JavaSessions;

public class User {

	// class variables:
	String name;
	String emailId;
	long phoneNumber;
	boolean isActive;

	// class methods:
	public String getUserOrderDetails(String userName) {

		if (userName.equals("Tom")) {
			return "Apple MacBook";
		} else if (userName.equals("Steve")) {
			return "Samsung S8";
		} else {
			System.out.println(userName + " is not found");
			return "user not found";
		}
	}

	public long getUserPhoneNumber(String userName) {
		if (userName.equals("Tom")) {
			return 98989;
		} else if (userName.equals("Steve")) {
			return 987788;
		} else {
			System.out.println(userName + " is not found");
			return -1;
		}
	}

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.name = "Tom";
		user1.phoneNumber = 9898989;
		
		String itemName = user1.getUserOrderDetails(user1.name);
		System.out.println(itemName);
		
		long ph = user1.getUserPhoneNumber(user1.name);
		System.out.println(ph);

	}

}
