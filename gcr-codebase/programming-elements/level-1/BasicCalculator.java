import java.util.*;
public class BasicCalculator{
	public static void main(String[]args){
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		double number1,number2;
		
		//User Input
		System.out.println("Enter First Number : ");
		number1 = sc.nextDouble();
		System.out.println("Enter Second Number : ");
		number2 = sc.nextDouble();
		
		//Calculations
		double addition = number1+number2;
		double subtraction = number1-number2;
		double multiplication = number1*number2;
		double division = number1/number2;
		
		//Displaying Result
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2+" is "+
		addition + ", " + subtraction + ", " + multiplication + ", and " + division);
		
		
		
	}
}