package OOPInheritance;

public class NYU extends University2 {
	

	@Override
	public void regularClasses() {
		System.out.println("NYU - Regular Classes");
	}
	@Override
	public void eveningClasses() {
		System.out.println("NYU - Evening Classes ");
	}
	
	public void specialSessions() {
		System.out.println("NYU - Special Sessions");
	}
	
	public void phdCourse() {
		System.out.println("NYU - PHD Course");
	}
	
	public void dualDegreeCourse() {
		System.out.println("NYU - Dual Degree Course");
	}

}
