package project1;

import java.util.Scanner;

public class breakfastwhile {

	public static void main(String args[])
	{ char choice;
	int bill=0;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.print("Select your option :\n 1.Breakfast\n 2.Lunch\n 3.Dinner\n");
	int op=sc.nextInt();
	if(op==1)
	{
	System.out.print("Select your option :\n 1.Coffee\n 2.Dose\n");
	int cho=sc.nextInt();
	if(cho==1)
	{
	bill=bill+30;
	System.out.println("Your bill is: "+bill+"Rs");
	}
	else if(cho==2)
	{
	bill=bill+50;
	System.out.println("Your bill is: "+bill+"Rs");
	}
	}
	else if(op==2)
	{
	System.out.print("Select your option :\n 1.Pizza\n 2.Burger\n");
	int choose=sc.nextInt();
	if(choose==1)
	{
	bill=bill+300;
	System.out.println("Your bill is: "+bill+"Rs");
	}
	else if(choose==2)
	{
	bill=bill+200;
	System.out.println("Your bill is: "+bill+"Rs");
	}
	}else if(op==3)
	{
	System.out.print("Select your option :\n 1.Rice\n 2.Chapati\n");
	int ch=sc.nextInt();
	if(ch==1)
	{
	bill=bill+70;
	System.out.println("Your bill is: "+bill+"Rs");
	}
	else if(ch==2)
	{
	bill=bill+50;
	System.out.println("Your bill is: "+bill+"Rs");
	}
	}
	System.out.print("Do you want to continue?(y/n)");
	choice=sc.next().charAt(0);



	}while(choice=='y');
	System.out.print("Thankyou visit again!!!");



	}
	}

