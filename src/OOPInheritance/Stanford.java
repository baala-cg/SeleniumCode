package OOPInheritance;

public class Stanford extends University2 {
	
	

	@Override
	public void eveningClasses() {
		System.out.println("Stanford - Evening Classes ");
	}
	@Override
	public void regularClasses() {
		System.out.println("Stanford - Regular Classes");
	}
	
	public void specialSessions() {
		System.out.println("Stanford - Special Sessions");
	}
	
	public void phdCourse() {
		System.out.println("Stanford - PHD Course");
	}
	
	public void dualDegreeCourse() {
		System.out.println("Stanford - Dual Degree Course");
	}
}
