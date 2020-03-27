package OOPInheritance;

public class MIT extends University2 {

	@Override
	public void regularClasses() {
		System.out.println("MIT - Regular Classes");
	}
	@Override
	public void eveningClasses() {
		System.out.println("MIT - Evening Classes ");
	}
	
	public void specialSessions() {
		System.out.println("MIT - Special Sessions");
	}
	
	public void phdCourse() {
		System.out.println("MIT - PHD Course");
	}
	
	public void dualDegreeCourse() {
		System.out.println("MIT - Dual Degree Course");
	}
}
