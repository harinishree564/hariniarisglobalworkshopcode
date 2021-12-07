package project1;

import java.util.Scanner;

public class factmethod {



	void factOF(int x)
    {
		double fact=1;
		int number = 5;
    for(int i=1;i<=number;i++)
    
	fact = fact* i;
    System.out.println("the fact is:" +fact);
    
    

    }

    public static void main(String aa[])
    {
    	
    	System.out.println("enter the number:");
    	Scanner sc=new Scanner(System.in);
    	int op = sc.nextInt();
    			// System.out.println("enter the number:");

    			 
    			 factmethod f =new factmethod();
    			 
				f.factOF(op);
       
 
    }

}



