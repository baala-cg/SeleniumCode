package JavaSessions;

public class StaticConcept {
	
	//class variables
	String name;
	static int age = 25;
	
	public void getName(){
		System.out.println("get Name");
	}
	
	public static void getValue(){
		System.out.println("get Value");
	}

	public static void main(String[] args) {
		
		StaticConcept obj = new StaticConcept();
		obj.name = "Tom";
		obj.getName();
		//obj.age = 25;
		
		//static way:
		System.out.println(age);
		getValue();
		
		System.out.println(StaticConcept.age);
		StaticConcept.getValue();
		
		
	}

}
