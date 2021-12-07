package project1;

import java.util.Scanner;

public class posnegmethod {
	public static void main (String args[]){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the number for check positive or negative: ");
		int num=scan.nextInt();
		if(num>=0) 
		    System.out.println(num+" is positive"); 
		else 
		    System.out.println(num+" is negative");
		
		find_Oddeven(num);
		}
	
		static boolean find_Oddeven(int num)
		{
		return (num>=0);//return the value
		}
		}

