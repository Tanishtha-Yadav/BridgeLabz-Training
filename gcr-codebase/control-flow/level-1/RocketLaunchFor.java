import java.util.*;
public class RocketLaunchFor{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int counter = sc.nextInt();
	
		for(int i=counter;i>0;i--){
			System.out.println(i);
		}
		
	sc.close();
	}
}