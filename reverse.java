package project2;

import java.util.Scanner;

public class reverse {
	

	public static void main(String[ ] arg)
	{

		{
		String str;
		char ch;
		
		System.out.print("Enter a string : ");
		Scanner sc =new Scanner(System.in);
		str=sc.nextLine();	
		System.out.println("Reverse of a String '"+str+"' is  :"); 
		for(int j=str.length();j>0;--j)
		{
		System.out.print(str.charAt(j-1)); 
		}
	}
	}
}
