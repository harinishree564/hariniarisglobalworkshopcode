package project1;

import java.util.Scanner;

public class calculator {
	
	public static void main(String aa[]){
        @SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
        String calculator;

        do {
            System.out.print("Enter your first digit: ");
            double num1 = keyboardInput.nextDouble();

            System.out.print("Enter your operator: ");
            String op = keyboardInput.next();

            System.out.print("Enter your second digit: ");
            double num2 = keyboardInput.nextDouble();

            System.out.print("= ");

            if (op.equals("+")){
                System.out.print(num1 + num2);
                
            }
            else if (op.equals("-")){
                System.out.print(num1 - num2);
               
               }else if (op.equals("*")){
                System.out.print(num1 * num2);
                
            }else if (op.equals("/")){
                System.out.print(num1 / num2);
                
            }else if (op.equals("%")){
                System.out.print(num1 % num2);
                
            }else{
                System.out.println("Invalid operator");
            }
            System.out.print("Would you like to restart the calculator? (y or n): ");
            calculator = keyboardInput.next();
        }
        while (calculator.equals("y"));

        if (calculator.equals("n")){
            
        }
    }
}
