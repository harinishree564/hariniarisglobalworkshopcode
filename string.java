package project2;

public class string {

	
	
	public static void main (String[] args)
	{
	String val="harini";
	try
	{
	if(val.length()<10)
	{
	throw new Stlength("LengthNotMatch Exception");
	}
	else {
	System.out.println(val);
	}
	}
	catch(Stlength e)
	{
	System.out.println(e);
	}
	}



	}
	class Stlength extends Exception
	{
	public Stlength(String val)
	{
	super(val);
	}
	}

