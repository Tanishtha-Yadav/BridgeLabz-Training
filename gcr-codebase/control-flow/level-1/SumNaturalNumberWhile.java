import java.util.*;
public class SumNaturalNumberWhile{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	int sum=0;
	
	if(number>=0)
	{
		int temp = number;
		while(number>=0)
		{
			sum+=number;
			number--;
		}
		int formula = temp*(temp+1)/2;
		
		System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formula);
		
		if(sum==formula){
		System.out.println("Both Sum and formula are Giving same results");
		}
		else {
			System.out.println("Both are not giving same results");
		}
	}
	sc.close();
	}
}