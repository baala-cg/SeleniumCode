package OOPInheritance;
public class TestUniversity {
	public static void main(String[] args) {
		System.out.println("*********Stanford Child Class Object Creation*********");
		Stanford sObj = new Stanford();
		sObj.regularClasses();
		sObj.eveningClasses();	
		sObj.classroom();
		System.out.println("*********MIT Child Class Object Creation*********");
		MIT mObj = new MIT();
		mObj.regularClasses();
		mObj.eveningClasses();
		System.out.println("*********NYU Child Class Object Creation*********");
		NYU nObj = new NYU();
		nObj.regularClasses();
		nObj.eveningClasses();		
		System.out.println("*********Parent Class Object Creation*********");
		University2 uObj = new University2();
		uObj.regularClasses();
		uObj.eveningClasses();
		uObj.classroom();
		System.out.println("*********Top Casting*********");
		University2 tcObj = new Stanford();
		tcObj.regularClasses(); // Child class Overridden method
		tcObj.eveningClasses(); // Child class Overridden method
		tcObj.classroom();      // Parent Class method
		
		System.out.println("*********Down Casting*********");
		try {
			MIT dcObj = (MIT) new University2();
			dcObj.dualDegreeCourse(); // Exception Child Class method
			dcObj.classroom(); // Exception Parent Class method
			}
		catch(Exception e){
			e.printStackTrace();
			e.getMessage();	
		}
		

	}

}
