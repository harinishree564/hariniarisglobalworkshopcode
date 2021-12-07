package project1;

public class inheritanceresult {

	public static void main (String args[]){
		Marks a= new Marks();
		a.ReadDetails();
		a.DisplayDetails();
		a.ReadMarks();
		a.DisplayMarks();
		}}
		class Studen{
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
		class Mark extends Studen{
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
		
		class Result extends Mark{
			int totalmarks;
			int percentage;
			String grade;
		    int average;
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
		