package project1;

public class grade {
	public static void main(String aa[])
    {
     
	int average=67;
	char grade;

    if(average>=80){
    	System.out.println("grade A");
    }else if(average>=60 && average<80){
    	System.out.println("grade B");
    }
    else if(average>=40 && average<60){
    	System.out.println("grade C");
    }
    else {
       grade = 'D';
    }
    }
}
