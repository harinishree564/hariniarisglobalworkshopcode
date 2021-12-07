package project2;

public class bike {
	public static void main(String args[])
    {
		Honda h = new Honda();
		h.brake();
    }
}


abstract class MotorBike {
	  abstract void brake();
	  
	  
	  
	}


class Honda extends MotorBike {
	
	void brake() {
		System.out.println("it has 2 wheels");
		
	}
	
}