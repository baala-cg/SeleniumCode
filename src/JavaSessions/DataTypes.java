package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//this is my first java code
		
		/**
		 * multiple line comment
		 * my name is bala krishna
		 * write /** and then click enter to enter in multi line comments
		 */
		
		//data types:
		//type of data supported in Java
		
//		1.Primitive Data Type:
//			a. Boolean  : true/ false
//			b. Char
//			c. Numeric Type
//			1. Integer family : byte, short, int, long
//			2. Floating family : float, double
//			
//			2. non-Primitive Data Type
//			String Array
//
//			1.byte 
//		size - 8 bits && Range : -128 to 127
		byte b = 10; //variable b takes 8 bits of memory
//	    byte b = 20;  // not allowed bcoz b is already taken in memory
	    
	    b = 20;
	    b = 30;
	    byte b1= 35;  //warning is coming as variable is declared and initialized but not used.
	    
	    System.out.println("value of variable b is " + b);
	    System.out.println(b1+b);
	    
	    //2. short , size - 16 bits, range -32768 to 32767
	    
	  //  short b = 40;  //cannot give the same name for other data type as name is already taken 
	    		short sh = 100;
	    		short sh1 = -90;
	    		
	    		System.out.println(sh+sh1);
	    		
	    		
	    		//3. int, size = 32 bits
	    		int empnum = 69474;
	    		int sal = 50000;
	    	//	int s = 9.9;  // cannot store floating number
	    		int i = 1000;
	    		int k = -900;
	    		int l = 0;
	    		System.out.println(i+k*l);//1000 as * has preference and would be executed first
	    		System.out.println((i+k)*l);  //0
	    		System.out.println(sal+sh1);
	    		
	    		//4. long, size = 64 bits
	    		
	    		long l1 = 10000000;
	    		System.out.println(l1);
	    		
	    		//5. float,  size : 32 bits
	    		//upto 7 decimal digits
	    		
	    		float price = 45.34f;
	    		float NAV = (float) 120.123;
	    		float f3 = 100; // treated as 100.00
	    		
	    		System.out.println(NAV+price);
	    		System.out.println(f3);  //100.0
	    		
	    		// 6. double , size = 64 bits
	    		//upto 16 decimal digits
	    		double d1 = 1000.1223344; 
	    		System.out.println(d1+f3);
	    		
	    		//7. boolean , size ~1 bit (approx) less than 1 bit
	    		//valid values - true or false
	    		
	    		boolean flag1 = true;
	    		boolean flag2 = false;
	    		
	    		
	    		//8. char , size 16 bits
	    		
	    		char c1 = 'a';
	    		char c11 = 'b';
	    		System.out.println(c1+c11); //ASCII value of chars a & b - 97+98 = 195
	    		//ASCII values
	    		//a-z  : 97 to 122
	    		//A-Z  : 65 to 90  
	    		//0-9 : 48 to 57
	    		
	    	//	char v1 = 'bb'; //not allowed, only one character is allowed
	    		//String
	    		
	    		String str = "hello world";  //String is a class in Java, in Java all class names starts with Capital letter
	    		System.out.println(str);
	    		String str1 = "1000"; // 1000 here would be string and not a number
	    		System.out.println(str1+20); //100020, concatenation would happen here as the system compilation would start from left to right  
	    		String str2 = "this is my java code";
	    		System.out.println(str+ " " +str2);//hello world this is my java code


	    		
		
	}

}
