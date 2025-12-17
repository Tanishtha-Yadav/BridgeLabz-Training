import java.util.*;
public class HeightConversion{
	public static void main(String[]args){
		// user input using scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your height : ");
		double height = input.nextDouble();
		double inches = height/2.54;
		double feet = inches/12;
		
		//Display results
		System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
	}
}