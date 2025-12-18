import java.util.*;
public class SumNaturalNumberFor{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	//logic 
	if(number>=0)
	{
		int sum=0;
		int temp = number;
		for(int i=0;i<=number;i++){
			sum+=i;	
		}
		int formula = temp*(temp+1)/2;
		
		System.out.println("Sum using for loop: " + sum);
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