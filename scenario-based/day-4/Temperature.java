import java.util.*;
public class Temperature{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double temperature[]= new double[7];
		double max=0;
		double sum=0;
		
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter temperature: ");
			temperature[i]= sc.nextDouble();
			sum+=temperature[i];
			if(temperature[i]>max)
			{
				max=temperature[i];
			}
		}
		System.out.println("Average temperature of 7 days : "+(sum/7));
		System.out.println("Maximum Temperature of 7 days : "+max);
	}
}