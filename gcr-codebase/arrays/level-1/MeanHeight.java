import java.util.*;
public class MeanHeight{
	public static void main(String[]args)
	{
		// Scanner kbject for user input
		Scanner sc = new Scanner(System.in);
		
		double height[] = new double[11];
		double sum = 0;
	
		System.out.println("Enter Heights: ");	
		for(int i = 0; i<height.length;i++)
		{
			height[i] = sc.nextInt();
			sum+=height[i];
		}
		
		//mean calculation
		double mean = sum/11;
		System.out.println("Mean Height : "+mean);
	}
}