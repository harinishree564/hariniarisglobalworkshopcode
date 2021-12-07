package project1;

public class methoddex {
	String name,rollno;



	void setName(String name)
	{
	this.name=name;
	}

	void setRollno(String rollno)
	{
	this.rollno=rollno;
	}

	String getName()
	{
	return name;
	}

	String getRollno()
	{
	return rollno;
	}




	public static void main (String args[]){
	methoddex t1=new methoddex();
	t1.setName("harini");
	t1.setRollno("22");



	System.out.print("Name:"+t1.getName()+"\nAge:"+t1.getRollno());



	}
	}

