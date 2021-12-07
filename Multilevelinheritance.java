package project2;

import java.util.Scanner;

public class Multilevelinheritance {
	Scanner sc=new Scanner(System.in);

	public static void main (String args[]){

	Result a= new Result();
	a.ReadDetails();
	a.DisplayDetails();
	a.ReadMarks();
	a.DisplayMarks();
	a.calculateResult();
	a.DisplayResult();
	}



	}
	class Studen{
	int studentid;
	String studentname,phone;
	void ReadDetails()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student ID: ");
	studentid=sc.nextInt();
	System.out.println("Enter the student Name: ");
	studentname=sc.next();
	System.out.println("Enter the student phone number: ");
	phone=sc.next();

	}
	void DisplayDetails()
	{
	System.out.println("Student name is :"+studentname);
	System.out.println("Student id is :"+studentid);
	System.out.println("Student phone number is :"+phone);
	}
	}
	class Mark extends Studen{
	int m1,m2,m3;
	void ReadMarks()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the maths marks: ");
	m1=sc.nextInt();
	System.out.println("Enter the science marks: ");
	m2=sc.nextInt();
	System.out.println("Enter the physics marks: ");
	m3=sc.nextInt();
	}
	void DisplayMarks()
	{
	System.out.println("\n"+studentname+" marks are:\nsubject1:"+m1+"\nsubject2:"+m2+"\nsubject3:"+m3);
	}
	}
	class Result extends Mark{
	int totalmarks,percentage;
	String grade;
	void calculateResult()
	{
	totalmarks=m1+m2+m3;
	percentage=(totalmarks/3);
	if(percentage>=80)
	{
	System.out.println("Your grade is: A Grade");
	}
	else if(percentage<80 && percentage>=60)
	{
	System.out.println("Your grade is: B Grade");
	}
	else if(percentage<60 && percentage>=40)
	{
	System.out.println("Your grade is: C Grade");
	}
	else
	{
	System.out.println("FAIL");
	}



	}
	void DisplayResult()
	{
	System.out.println("Student :"+studentname+"Total marks is:"+totalmarks);
	System.out.println("Student :"+studentname+" percentage is:"+percentage+" %");
	}



	}

