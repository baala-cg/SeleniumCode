package JavaSessions;

import java.util.ArrayList;

/**
 * 
 * @author JyothiKrishna
 *
 */
public class FunctionsInJava {

	// can not create a function inside a function
	// data members of class : class variables and class methods

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		int num = obj.getNumber();
		System.out.println(num);

		// System.out.println(obj.getNumber());

		String s1 = obj.getTrainerName();
		System.out.println(s1);

		int sum1 = obj.sum(40, 20);
		System.out.println(sum1);

		int sum2 = obj.sum(50, 20);
		System.out.println(sum2);

		int score = obj.getMarks("Bibek");
		System.out.println(score);

		int score1 = obj.getMarks("Naveen");
		System.out.println(score1);

		String brName = obj.launchApp("chrome");
		System.out.println(brName);

		String brName1 = obj.launchApp("opera");
		System.out.println(brName1);

		int m[] = obj.getStudentMarks();
		System.out.println(m.length);

		ArrayList<String> EmpMSList = obj.getEmployeeList("MS");
		System.out.println(EmpMSList);

		ArrayList<String> EmpGoogleList = obj.getEmployeeList("Google");
		System.out.println(EmpGoogleList);

		ArrayList<String> EmpUberList = obj.getEmployeeList("Uber");
		System.out.println(EmpUberList);
	}

	// 1. simple function : no input and no return:
	// void - can not return anything
	// return type: void

	public void test() {
		System.out.println("test method");
	}

	// 2. no input but some return:
	// return type: int
	public int getNumber() {
		System.out.println("get number");
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String s = "Naveen";
		return s;
	}

	// 3. some input parameters and some return:
	public int sum(int a, int b) {
		System.out.println("SUM method");
		int z = a + b;//
		return z;
	}

	public int getMarks(String studentName) {
		System.out.println("get marks: " + studentName);
		int marks = -1;

		if (studentName.equals("Bibek")) {
			marks = 90;
		} else if (studentName.equals("Pavani")) {
			marks = 80;
		} else if (studentName.equals("Sree")) {
			marks = 95;
		} else {
			System.out.println("student name not found " + studentName);
		}

		return marks;
	}

	// param: browserName and return browsername
	/**
	 * 
	 * @param browserName
	 * @return
	 */
	public String launchApp(String browserName) {
		String name = null;

		if (browserName.equals("chrome")) {
			System.out.println("launch chrome");
			name = "chrome";
		} else if (browserName.equals("ff")) {
			System.out.println("launch ff");
			name = "firefox";
		} else if (browserName.equals("IE")) {
			System.out.println("launch IE");
			name = "Internet Explorer";
		}

		return name;

	}

	/**
	 * 
	 * @return marks
	 */
	public int[] getStudentMarks() {
		System.out.println("get student marks");
		int marks[] = new int[4];
		marks[0] = 100;
		marks[1] = 50;
		marks[2] = 60;
		marks[3] = 70;

		return marks;
	}

	/**
	 * This method this method returns an ArrayList of String - returns employee
	 * list on the basis of company name
	 * 
	 * @param companyName
	 * @return this method returns an ArrayList of String - returns employee
	 *         list on the basis of company name
	 */
	public ArrayList<String> getEmployeeList(String companyName) {
		ArrayList<String> compList = new ArrayList<String>();

		if (companyName.equals("IBM")) {
			compList.add("Anitha");
			compList.add("Rohini");
			compList.add("Pari");
		} else if (companyName.equals("MS")) {
			compList.add("Santosh");
			compList.add("Sandhya");
		} else if (companyName.equals("Google")) {
			compList.add("Tanseeque");
		} else {
			System.out.println("company name is not found " + companyName);
		}

		return compList;

	}

}
