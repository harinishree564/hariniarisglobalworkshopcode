package project1;

public class inheritance {

	
	
	public static void main (String args[]){
	Marks a= new Marks();
	a.ReadDetails();
	a.DisplayDetails();
	a.ReadMarks();
	a.DisplayMarks();
	}}
	class Student{
	int studentid;
	String studentname,phone;
	void ReadDetails()
	{
	studentid=11;
	studentname="harini";
	phone="990103";
	}
	void DisplayDetails()
	{
	System.out.println("Student name is :"+studentname);
	System.out.println("Student id is :"+studentid);
	System.out.println("Student phone number is :"+phone);
	}
	}
	class Marks extends Student{
	int m1,m2,m3;
	void ReadMarks()
	{
	m1=90;
	m2=88;
	m3=92;
	}
	void DisplayMarks()
	{
	System.out.println("\n"+studentname+" marks are:\nsubject1:"+m1+"\nsubject2:"+m2+"\nsubject3:"+m3);
	}
	}

	

