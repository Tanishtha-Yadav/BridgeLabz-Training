import java.util.*;
public class SandeepFitness
{	
	public static void main(String [] args)
	{
		int[] week = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Fitness challenge Tracker ");
		for(int i=0;i<week.length;i++){
			System.out.println("Enter 0 for rest day");
			System.out.println("Enter pushups of day: "+(i+1));
			int temp = sc.nextInt();
			if(temp >0){
				week[i] = temp;
				
			}
			else if (temp == 0){
				i--;
				continue;
				
			}
			
		
		}
		int total =0;
		for(int count : week){
			total+= count;
		}
		double avg = total/7;
		System.out.println("Total Number of pushUps in the week is :"+total);
		System.out.println("Avg number of pushups in this week is  :"+avg);
		
	}
}