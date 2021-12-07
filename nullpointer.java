package project2;

import java.util.Collections;
import java.util.List;

public class nullpointer {
	
	public static void main(String[] args) {

        Person personObj = null;
        try {
            String name = personObj.personName; 
            personObj.personName = "harini"; 
        } catch (NullPointerException e) {
            System.err.println("NullPointerException caught!");
            e.printStackTrace();
        }

    }
}

class Person {

    public String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
