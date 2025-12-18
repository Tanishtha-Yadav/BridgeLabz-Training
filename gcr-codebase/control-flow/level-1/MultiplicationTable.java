import java.util.*;
public class MultiplicationTable{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter a number : ");
	int number = sc.nextInt();
	
	for(int i=6;i<=9;i++)
	{
		System.out.println(number+"*"+i+"="+number*i);
	}
	
	sc.close();
	}
}