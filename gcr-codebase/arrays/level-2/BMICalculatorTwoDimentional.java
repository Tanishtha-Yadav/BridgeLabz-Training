import java.util.*;
public class BMICalculatorTwoDimentional
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons:");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for(int i =0;i<number;i++)
		{
            System.out.println("Enter height of person " + (i + 1));
            double height = sc.nextDouble();
            while(height<=0) 
			{
                System.out.println("Height must be positive. Enter again:");
                height = sc.nextDouble();
            }

            System.out.println("Enter weight of person " + (i + 1));
            double weight = sc.nextDouble();
            while(weight<=0)
			{
                System.out.println("Weight must be positive. Enter again:");
                weight = sc.nextDouble();
            }

            personData[i][0] = height;
            personData[i][1] = weight;
        }

        for(int i = 0;i<number;i++)
		{
            double bmi = personData[i][1]/(personData[i][0]*personData[i][0]);
            personData[i][2] = bmi;

            if(bmi<18.5) 
			{
                weightStatus[i] = "Underweight";
            } 
			else if(bmi<25) 
			{
                weightStatus[i] = "Normal";
            } 
			else if(bmi<30)
			{
                weightStatus[i] = "Overweight";
            } 
			else 
			{
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Height Weight BMI Status");
        for (int i = 0;i<number;i++)
		{
            System.out.println
			(
                personData[i][0] + " " +
                personData[i][1] + " " +
                personData[i][2] + " " +
                weightStatus[i]
            );
        }

        sc.close();
    }
}
