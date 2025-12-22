import java.util.*;
public class BMICalculator 
{
    // Method to calculate BMI and store in the 3rd column of the array
    public static void calculateBMI(double[][] data) 
	{
        for (int i = 0; i < data.length; i++) 
		{
            double weight = data[i][0]; 
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; 
        }
    }

    // Method to determine BMI status
    public static String[] determineStatus(double[][] data) 
	{
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++)
		{
            double bmi = data[i][2];
            if (bmi < 18.5) 
			{
                status[i] = "Underweight";
            }
			else if (bmi < 25)
			{
                status[i] = "Normal";
            }
			else if (bmi < 30)
			{
                status[i] = "Overweight";
            } 
			else 
			{
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; 

        for (int i = 0; i < 10; i++) 
		{
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
		
        String[] status = determineStatus(data);

        // Display results
        for (int i = 0; i < 10; i++) 
		{
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Status: " + status[i]);
        }
    }
}
