package version_E_2023;

import java.util.ArrayList;
import java.util.Scanner;



abstract class Person{
	private int ID;
	private String name;
	
	public Person(){
		
	}

	public Person(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	abstract void DisplayDetails();
	
	
	
}





abstract class Course{
	private String code;
	private String course_name;
	
	public Course() {
		
	}
	
	public Course(String code, String course_name) {
		super();
		this.code = code;
		this.course_name = course_name;
	}
	
	abstract void DisplayCourseDetails();
	
}

class Student extends Person{
	ArrayList<String> enrolledCourse=new ArrayList<>();


	
	public Student() {
		
	}
	
	
	public Student(int ID,String name,ArrayList<String> enrolledCourse) {
		super(ID,name);
		this.enrolledCourse = enrolledCourse;
	}


	public void EnrollnCourse(Course c) {
		Scanner myScanner=new Scanner(System.in);
	
		System.out.println("Enter your course:");
		String course=myScanner.next();
		this.enrolledCourse.add(course);
	}
	
	public void DisplayDetails() {
		System.out.println("Name of the student:"+getName());
		System.out.println("ID of the student:"+getID());
		System.out.println("Enrolled courses:");
		for(Course courses: enrolledCourse) {
			courses.DisplayCourseDetails();
		}
	}
}


public class Question1 {

	public static void main(String[] args) {
	

	}

}
