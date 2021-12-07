package project2;

public class student {
	
	public static void main (String[] args)
	{
	int number=-1;
	try
	{
	if(number<0)
	{
	throw new Negative("Negative Exception");
	}
	else {
	System.out.println(number);
	}
	}
	catch(Negative e)
	{
	System.out.println(e);
	}
	}



	}
	class Negative extends Exception
	{
	public Negative(String number)
	{
	super(number);
	}
	}


