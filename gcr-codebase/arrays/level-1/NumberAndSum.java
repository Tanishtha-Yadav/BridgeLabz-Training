import java.util.*;
public class  NumberAndSum{
	public static void main(String[]args)
	{
		// Scanner class object
		Scanner sc = new Scanner(System.in);
		
		double number[]=new double[10];
		double total=0.0;
		int i=0;
	
		// logic part
		while(true)
		{
			System.out.println("Enter a number: ");
			double temp = sc.nextInt();
			
			if(temp<=0 || i>10)
			{
				break;
			}
			else
			{
				number[i] = temp;
				i++;
			}
		}
		
		// displaying results
		for(int j=0;j<number.length;j++)
		{
			System.out.println(number[j]);
			total+=number[j];
		}
		System.out.println("Total of all the numbers : "+total);
	}
}