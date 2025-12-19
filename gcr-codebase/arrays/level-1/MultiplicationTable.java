import java.util.*;
public class MultiplicationTable{
	public static void main(String[]args)
	{
		//Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		int multiplicationTable[]= new int[10];
		
		for(int i=0;i<multiplicationTable.length;i++)
		{
			multiplicationTable[i]=number*(i+1);
			System.out.println(number+"*"+(i+1)+"="+multiplicationTable[i]);
		}
		sc.close();
	}
}