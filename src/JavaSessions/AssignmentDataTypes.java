package JavaSessions;
public class AssignmentDataTypes {
	public static void main(String[] args) {	
		//1. Data Types
		System.out.println("Hello" + "\n" + "Naveen K");
		//2.
		System.out.println(74+36);
		//3.
		System.out.println(50/3);	
		//4.
		int exp1 =(-5 + 8 * 6) ; int exp2 =((55+9) % 9 ); 
		int exp3 = (20 + -3*5 / 8) ; int exp4 = (5 + 15 / 3 * 2 - 8 % 3);
		System.out.println(exp1 + "\n" + exp2 + "\n" + exp3 + "\n" + exp4);
		//5.
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
		
		//1. Conditional Operators
		byte a = 25 ; byte b = 78 ; byte c = 87 ; byte d = 90 ;
		if (a > b && a > c && a> d) {
			System.out.println("The greatest: "+a);
		}
		else if (b >c && b > d) {
			System.out.println("The greatest: "+b);
		}
		else if (c > d) {
			System.out.println("The greatest: "+d);
		}
		else {
			System.out.println("The greatest: "+d);
		}		
		//2.
		double x = -212.345 ;	
		if (x >= 0) {
			System.out.println("Input number: " + x + " -- positive number");
		}
		else {
			System.out.println("Input number: " + x + " -- negative number");
		}
			
	}
//		Data Types:
//			1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//			Expected Output :
//			Hello 
//			Naveen K
//
//			2. Write a Java program to print the sum of two numbers. 
//			Test Data: 
//			74 + 36 
//			Expected Output :
//			110
//
//
//			3. Write a Java program to divide two numbers and print on the screen. 
//			Test Data : 
//			50/3
//			Expected Output :
//			16
//
//
//			4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//			Test Data:
//			a. -5 + 8 * 6
//			b. (55+9) % 9 
//			c. 20 + -3*5 / 8 
//			d. 5 + 15 / 3 * 2 - 8 % 3 
//			Expected Output :
//			43 
//			1 
//			19 
//			13
//
//
//			5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//			Test Data:
//			((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//			Expected Output
//			2.138888888888889
//
//
//
//			Conditonal Operators:
//
//			1. Take four numbers  and print the greatest number. 
//
//			Test Data
//			Input the 1st number: 25 
//			Input the 2nd number: 78 
//			Input the 3rd number: 87
//			Input the 3rd number: 90
//			Expected Output :
//			The greatest: 90
//
//
//			2. Write a Java program to test a number is positive or negative.
//
//			Test Data
//			Input number: 35 -- positive number
//			Input number: -11 -- negative number
//		
//		
//		
//		
//	}

}
