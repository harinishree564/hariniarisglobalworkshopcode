package project1;

public class facto {

	import java.util.Scanner;
	public class Factorial {
	public static void main(String args[]) {
	double i,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	double a=sc.nextInt();
	for(i=1; i<=a; i++)
	{
	fact=fact*i;
	}
	System.out.println("Factorial of "+a+"is:"+fact);

	}



	}

