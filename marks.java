package project2;

public class marks {
	
	public static void main (String[] args)
	{
	int num=150;
	try
	{
	if(num<200)
	{
	throw new Markss("Failed Exception");
	}
	else {
	System.out.println("Student is pass");
	}
	}
	catch(Markss e)
	{
	System.out.println(e);
	}
	}



	}
	class Markss extends Exception
	{
	public Markss(String marks)
	{
	super(marks);
	}
	}

