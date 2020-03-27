package JavaSessions;

public class College extends University1 implements Commerce, Medical, NonMedical {
	
	public static void main(String args[]) {		
		College cbit = new College();
		cbit.arts();
		cbit.biology();
		cbit.chemistry();
		cbit.economics();
		cbit.engineering();
		Commerce.tax();
		cbit.accounts();
		cbit.feeStructure();	
	}
	// non-overridden methods:
	public void chemistry() {
		System.out.println("College method - Chemistry");
	}
	@Override
	public void biology() {
	System.out.println("College - Biology");	
	}

	@Override
	public void science() {
		System.out.println("College - Science");		
	}

	@Override
	public void economics() {
		System.out.println("College - Economics");		
	}
	@Override
	public void mathematics() {
		System.out.println("College - Mathematics");	
	}
}
