package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		//concat means joining, combiningint 
		int a = 100;
		int b = 200;
		
		String x ="Hello";
		String y = "Java";
		System.out.println(x+y); //HelloJava
		System.out.println(a+x); //100Hello
		System.out.println(a+x+y); //100HelloJava
		
		System.out.println(a+b+x+y);  //300HelloJava
		System.out.println(x+y+a+b);   //HelloJava100200   Hello would be concatenated to Java and becomes HelloJava and HelloJava would 
		//be added to 100 and becomes HelloJava100 and then HelloJava100 added to 200 would become HelloJava100200
		//Concats from left to right as the system compiles from left to right
		
		System.out.println(x+y+(a+b)); //HelloJava300 left to right execution
		System.out.println("value of a :" + a);  //value of a :100

		System.out.println("value of a :" + b);  //value of a :200

		System.out.println("sum of a and b :" + a+b); //sum of a and b :100200
		System.out.println("sum of a and b is:" +(a+b));  //sum of a and b is:300
		
		int total = 100;
		int finalamount = total+50;
		System.out.println("final amount value is :" + finalamount);  //final amount value is :150

		System.out.println("final amount value is :" + (total +50));  //final amount value is :150



	}
	

}
