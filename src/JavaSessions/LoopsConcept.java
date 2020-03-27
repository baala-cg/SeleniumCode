package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10:
		//1. while:
		int i = 1;//initilization
		while(i<=10){//conditional
			System.out.println(i); //1 2 3 .... 10
			i++; //incremental/decremental
		}
		
		//10 to 1:
		
//		int j = 10;
//		while(j>1){
//			System.out.println(j);//10 11
//			j++;
//		}
		
//		while(true){
//			System.out.println("Bye!!");
//		}
		System.out.println("-----");
		//2. for loop: 1 to 10:
		for(int k=1; k<=10; k++){
			System.out.println(k); //1 2 3 4 5 6 7 8 9 10
		}
		
//		for(; ;){
//			System.out.println("Hey!!");
//		}
		System.out.println("--even numbers---");

		//even numbers b/w 1 to 10: 2 4 6 8 10
		for(int e=2; e<=10; e=e+2){
			System.out.println(e);//2 4 6 8 10
		}
		
		System.out.println("--odd numbers---");
		//odd numbers b/w 1 to 10 : 1 3 5 7 9
		for(int odd = 1; odd<=10; odd=odd+2){
			System.out.println(odd); //1 3 5 7 9
		}
		
		System.out.println("--for if---");

		//for with if:
		for(int m=1; m<=10; m++){
			if(m % 2 == 0){
				System.out.println(m); //2 4 6
			}
		}
		
		System.out.println("--for if - 2nd ex---");

		for(int d=1; d<=100; d++){
			System.out.println(d);
			if(d % 5 ==0){
				System.out.println("hey this divisble by 5");
				break;
			}
		}
		
		System.out.println("-----");

		//do-while: 10 to 1
		int p = 10;
		do{
			System.out.println(p);//10 9 8
			p--;
		}
		while(p>=1);
		
		//Assignments:
		//Loops Assignments:

//			1. WAP to print following output:
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//
//
//			2. WAP to print following output:
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9

		System.out.println("**** 1. WAP to print following output: *****");
			for (int s = 0 ; s <5 ; s++) {
				System.out.println("I am Batman" + "\n");
			}
			System.out.println("**** 2. WAP to print following output: *****");
			for ( int s = 1 ; s <10 ; s++) {
				System.out.println("I am Batman " + s + "\n");
			}
			System.out.println("*** 3. WAP to print 10 to 1 using for, while and do-while loop **");
			System.out.println("--------for loop 10 to 1------------");
			for (int s = 10 ; s > 0 ; s--) {
				System.out.println(s);
			}
			System.out.println("--------while loop 10 to 1------------");
			int v = 10;
			while ( v > 0 ) {
				System.out.println(v);
				v--;
			}
			System.out.println("--------do while loop 10 to 1------------");
			v = 10;
			do {	 
				System.out.println(v);
				v--;
			}
			while ( v > 0 );
			
			System.out.println("**** 4. Write a program in Java to print \"Hello World\" ten times using while , for and do-while loop ****");
			System.out.println("--------Hello World using while------------");
			v=1;
		    while(v < 11) {
			System.out.println("Hello World");
			v++ ;
		}
		
		    System.out.println("--------Hello World using do while------------");
			v=1;
			do {
				System.out.println("Hello World");
				v++ ;
			}
		    while(v < 11);
			
			System.out.println("--------Hello World using for------------");
			
			for ( v =1 ; v < 11 ; v++){
				System.out.println("Hello World");
			}
			System.out.println("***** 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered ******");
			v = 1 ;
			while (v < 11) {
			System.out.println(v);
			if (v % 7 == 0) {
				break;
			}
			v++ ;
		}	
			System.out.println("**** 6. WAP to print this series on the console using for, while and "
			+ "do-while loops : 6 12 18 24 30 36 42 48 54 60 ***");
			System.out.println("********* for loop ******");
			for(v=6 ; v< 61 ; v= v+6) {
				System.out.println(v);
			}
			
			System.out.println("********* while loop ******");
			v= 6;
			while(v< 61) {
				System.out.println(v);
				v = v+6 ;
			}
			System.out.println("********* do while loop ******");
			v= 6 ;
			do {
				System.out.println(v);	
				v = v+6 ;
			}
			while (v< 61 );
	}

}
