package JavaSessions;
import java.util.ArrayList;

//Constructor Assignments
//
//1. Design a University class template with the following features:
// //class variables:
//name
//country
//stablishedDate
//List of course provided in Array List<String>
//
//--Design the constructor of this class with different parameters and all parameters.
//--Call the constructors with object reference name
public class University {
	public String name ;
	public String country ;
	public String establishedDate ;
	public ArrayList<String> courseList ;
	
	public University(String name, String country, String establishedDate, ArrayList<String> courseList){
		this.name = name ;
		this.country = country ;
		this.establishedDate = establishedDate ;
		this.courseList = courseList ;
	}
	public static void main(String[] args) {

		ArrayList<String> course = new ArrayList<String>() ;
	    course.add("EC");
	    course.add("IT");
	    course.add("Mechanical");
	    course.add("Civil");
	    
	    ArrayList<String> courseUS = new ArrayList<String>() ;
	    courseUS.add("EC");
	    courseUS.add("IT");
	    courseUS.add("AI");
    University u1 = new University("Stanford", "US", "12-03-1980", courseUS);
    University u2 = new University("Andhra", "India", "01-01-2000", course);
    int countU1 = course.size();
    int countU2 = courseUS.size();
    System.out.println("Number of items in first Course ArrayList " + countU1);
    System.out.println("Number of items in US Course ArrayList " + countU2);
    System.out.println(u1.name + " " + u1.country + "  " + u1.establishedDate + " " + u1.courseList.get(2 	));   
    System.out.println(u2.name + " " + u2.country + "  " + u2.establishedDate + " " + u2.courseList);		
		
		
		
		
	}

}
