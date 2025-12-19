import java.util.*;
public class BonusCalculator{
	public static void main(String[]args){
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		int size = 10;
		
		// array initialising
		double salary[]=new double[size];
		double service[]=new double[size];
		double bonus[]=new double[size];
		double newSalary[]=new double[size];
		
		// variable initialising
		double totalBonus =0;
		double totalOldSalary =0;
		double totalNewSalary =0;
		
		// user input
		for(int i=0;i<size;i++)
		{
			System.out.println("Employee "+(i+1));
			System.out.println("Enter Salary: ");
			salary[i]=sc.nextDouble();
			
			System.out.println("Enter year of service: ");
			service[i]= sc.nextDouble();
			
			if(salary[i]<=0||service[i]<0)
			{
				System.out.println("Invalid Input! Enter Again.");
				i--;
				continue;
			}
		}
		
		
		for(int i =0;i<size;i++)
		{
			if(service[i]>5)
			{
				bonus[i]=salary[i]*0.05;
			}
			else 
			{
				bonus[i]=salary[i]*0.02;
			}
			
			newSalary[i]=salary[i]+bonus[i];
			
			totalBonus+=bonus[i];
			totalOldSalary+=salary[i];
			totalNewSalary+=newSalary[i];
			
		}
		
		System.out.println("Total old salary: "+ totalOldSalary);
		System.out.println("Total bonus paid: "+ totalBonus);
		System.out.println("Total new salary: "+ totalNewSalary);
		
		sc.close();
	}
}