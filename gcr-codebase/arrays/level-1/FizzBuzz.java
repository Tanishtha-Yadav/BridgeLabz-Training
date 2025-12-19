import java.util.*;
public class FizzBuzz{
	public static void main(String[]args){
	
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);
	
	// taking user input through Scanner class object
	System.out.println("Enter a number : ");
	int number = sc.nextInt();
	
	String array[]=new String[number];
	
	// logic part 
	int index=0;
	if(number>0)
	{
		 for(int i=1;i<=number;i++)
			 {
				if(i%3==0&&i%5==0){
					array[i-1]="FizzBuzz";
				} 
				else if(i%3==0){
					array[i-1]="Fizz";
				} 
				else if(i%5==0){
					array[i-1]="Buzz";
				}	 
				else{
					array[i-1]=String.valueOf(i);
				}
			}
	}
	
	// display result
	System.out.println(Arrays.toString(array));
	
	sc.close();
	}
}