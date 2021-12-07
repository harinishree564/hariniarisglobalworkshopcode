package project2;

public class demo {
	
	public static void main(String args[])
    {
		Tiger t = new Tiger();
		t.eat();
		t.makeSound();
    }

	
}
abstract class Animal {
	  abstract void makeSound();

	  public void eat() {
	   //add code

System.out.println("animal is eating");
	  }
	 
	  
	}


class Tiger extends Animal {
	void makeSound() {
		System.out.println("Tiger makes sound");
		}
	  
}
