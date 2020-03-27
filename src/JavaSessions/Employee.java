package JavaSessions;

public class Employee {

	// class variables
	String name;
	int age;
	String role;
	int empId;
	boolean isPermanent;

	public static void main(String[] args) {

		// create the object of Employee class:
		// use new keyword

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.name = "Tom";
		e1.age = 25;
		e1.role = "QA";
		e1.empId = 101;
		e1.isPermanent = true;
		
		e2.name = "Sandhya";
		e2.age = 26;
		e2.role = "Senior QA";
		e2.empId = 102;
		e2.isPermanent = false;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.role + " " + e1.empId + " " + e1.isPermanent);
		System.out.println(e2.name + " " + e2.age + " " + e2.role + " " + e2.empId + " " + e2.isPermanent);

		Employee e3 = new Employee();
		e3.name = "Nadia";
		e3.role = "SDET1";
		e3.age = 27;
		e3.empId = 103;
		
		System.out.println(e3.name);
		System.out.println(e3.role);
		System.out.println(e3.age);
		System.out.println(e3.empId);
		System.out.println(e3.isPermanent);
		
		//create object without reference variable:
		new Employee().name = "Saroj";
		new Employee().age = 25;
		
		//System.gc();
		
		
		//null object reference:
		Employee e5 = new Employee();
		new Employee().age = 45;
		e5 = null;
		e5 = new Employee();
		e5.name = "Sree";//NullPointerException
		System.out.println(e5.name); 
		
		
		
		
		
		
		
		
		
		
		

	}

}
