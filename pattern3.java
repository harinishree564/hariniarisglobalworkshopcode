package project2;

public class pattern3 {
	public static void main(String[] args)
	   {
	      int row=5, i, j, space, spaceLimit;
	      spaceLimit = (row*2) - 2;
	      
	      for(i=0; i<row; i++)
	      {
	         for(space=0; space<spaceLimit; space++)
	            System.out.print(" ");
	         for(j=0; j<=i; j++)
	            System.out.print("* ");
	         System.out.print("\n");
	         spaceLimit = spaceLimit-2;
	      }
	   }
	}

