package project1;

import java.util.Scanner;

public class summethod {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		
		sumNum(num1,num2); 
		}
		
		public static void sumNum(int num_1,int num_2){
		int sum=0;
		sum=num_1+num_2;
		System.out.println("Sum of two numbers  "+sum);
		}
		}