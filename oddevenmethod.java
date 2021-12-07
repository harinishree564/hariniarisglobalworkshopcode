package project1;

import java.util.Scanner;

public class oddevenmethod {
	
	public static void main (String args[]){
		Scanner scan=new Scanner(System.in);
	
		System.out.print("Enter the number for check odd or even: ");
		int num=scan.nextInt();
		if(num%2==0) 
		    System.out.println(num+" is even"); 
		else 
		    System.out.println(num+" is odd");

		find_Oddeven(num);//calling the method
		}
		//create a user defined method with return
		static boolean find_Oddeven(int num){//method definition
		return (num%2==0);//return the value
		}
		}

