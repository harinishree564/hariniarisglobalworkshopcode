package project2;

public class even {
	
	public static void main (String[] args)
	{
	int number=5;
	try
	{
	if(number%2 != 0)
	{
	throw new Even1("NotEven Exception");
	}
	else {
	System.out.println("Even number");
	}
	}
	catch(Even1 e)
	{
	System.out.println(e);
	}
	}}
	class Even1 extends Exception
	{
	public Even1(String number)
	{
	super(number);
	}}

	



