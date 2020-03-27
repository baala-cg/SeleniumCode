package JavaSessions;

import java.util.Scanner;
/**
 * 
 * @author Baalu
 *
 */
public class Methods {
//Method to get the sum of 2 numbers
	public static int getSum(int a, int b) {
		return (a+b);
	}
//Method to get the product of 2 numbers
	public static int getProd( int a, int b) {
		return (a*b);
	}
//Method to get the Circumference and Area of the Circle with radius as the parameter
	public static void getArea (float r) {
		System.out.println("Circumference of Circle with radius " + r + " is: " + (2 * 3.14 * r));
		System.out.println("Area of Circle with radius " + r + " is: " + (3.14 * r * r));
	}
//Method to get the Minimum number among 3 numbers
	public static void getMin(float a, float b, float c) {
		if(a < b &&  a < c) {
			System.out.println("Min number is : " + a);
		}
		else if (b < c) {
			System.out.println("Min number is : " + b);
			}
		else {
			System.out.println("Min number is : " + c);
		}		
	}
//Method to get the Maximum number among 3 numbers	
	public static void getMax(float a, float b, float c) {
		if(a > b &&  a > c) {
			System.out.println("Max number is : " + a);
		}
		else if (b > c) {
			System.out.println("Max number is : " + b);
			}
		else {
			System.out.println("Max number is : " + c);
		}		
	}
//Method to determine the number as Even or Odd
	public static void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is Even number");
		}
		else {
			System.out.println(a + " is Odd number");
		}
	}
//Method to find eligible Voter	
	public static void isVoter ( int a ) {
		if(a >= 18 ) {
			System.out.println("Person is eligible to vote");
		}
		else {
			System.out.println("Person is NOT eligible to vote: " + a);
		}
	}	
//Method to find whether the given number is Prime or not	
	public static void isPrime(int number) {
        boolean flag = false;
        for(int i = 2; i < number; i++)
        {
            // condition for non-prime number
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is NOT a prime number.");	
	  }
//Method to get the Grade based on marks as argument	
	public static void getGrade (int marks) {
		if (marks >= 91 && marks <= 100 ) {
			System.out.println("AA is the Grade");
		}
		else if(marks >= 81 && marks <= 90) {
			System.out.println("AB is the Grade");
		}
		else if (marks >= 71 && marks <= 80 ) {
			System.out.println("BB is the Grade");
		}
		else if (marks >= 61 && marks <= 70 ) {
			System.out.println("BC is the Grade");
		}
		else if (marks >= 51 && marks <= 60 ) {
			System.out.println("CD is the Grade");
		}
		else if (marks >= 41 && marks <= 50 ) {
			System.out.println("DD is the Grade");
		}
		else if (marks > 100 || marks < 0){
			System.out.println("Invalid marks entered");
		}
		else {
			System.out.println("Fail");
		}
	}
//Method to get Factorial value of a given number	
	public static long factorial(int n) {
		long prod = 1 ;
		for (int i = n; i > 0 ; i--) {
			 prod = prod * i ;	
			 
		}
		if (n == 0) {
			prod = 0;
		}
		return prod;
	}
	public static void main(String[] args) {

//		Methods in Java:
//			1.Write a program to print the sum of two numbers entered by user by defining your own method.
			int a =5000, b = 6000;
			System.out.println(Methods.getSum(a,b));	
//			2. Define a method that returns the product of two numbers entered by user.
			//int a =5000, b = 6000;
			System.out.println(Methods.getProd(a,b));				
//			3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
			//float rad = 34.56f ;
			float rad = (float) 34.56;
			Methods.getArea(rad);
//			4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
			float d = 20.11f, e = 30.5f, f = 25.11f ;
			Methods.getMin(d, e, f);
			Methods.getMax(d, e, f);
//			5. Define a program to find out whether a given number is even or odd.
			a = 1001 ;
			Methods.evenOdd(a);
//			6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
			int age = 17 ;
			Methods.isVoter(age);
			age = 24;
			Methods.isVoter(age);
//			7. Define a method to find out if number is prime or not.
			a = 9 ;
			Methods.isPrime(a);
			//			8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//			Marks        Grade
//			91-100         AA
//			81-90          AB
//			71-80          BB
//			61-70          BC
//			51-60          CD
//			41-50          DD
//			<=40          Fail
			Scanner myMarks = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter marks secured:");
		    String marks = myMarks.nextLine();  // Read user input
		    int m = (Integer.parseInt(marks)) ;
		    //System.out.println("Username is: " + userName);  // Output user input
			Methods.getGrade(m);
//			9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//			Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//			4! = 1*2*3*4 = 24
//			3! = 3*2*1 = 6
//			2! = 2*1 = 2
//			Also,
//			1! = 1
//			0! = 0
			int n = 10;
			System.out.println("Factorial of number " + n + "! is: " + Methods.factorial(n) );	
	}

}
