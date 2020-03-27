package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList - default class in java
		//dynamic array 
		//create the object of ArrayList class
		
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());

		ar.add(500);//4
		ar.add(600);//5
		ar.add(600);//6
		
		//to print all the values of arraylist: for loop:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		
		
//		System.out.println(ar.size());
//		
//		System.out.println(ar.get(6));
//		//System.out.println(ar.get(6));//IndexOutOfBoundsException
//
//		
//		ar.remove(4);
//		System.out.println(ar.size());
//		System.out.println(ar.get(4));
//		//System.out.println(ar.get(5));
//
		ar.add("Naveen");
		ar.add("Selenium");
		ar.add(true);
		ar.add('m');
		ar.add(12.33);
		
		//ArrayList with Integer:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(10);
		marksList.add(20);
		
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Steve");
		
		ArrayList<Object> empList = new ArrayList<Object>();
		empList.add("Tom");
		empList.add(25);
		empList.add('m');
		empList.add(true);
		
		
		
		
	}

}
