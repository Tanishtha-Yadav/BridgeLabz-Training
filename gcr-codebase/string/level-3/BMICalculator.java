import java.util.*;
public class BMICalculator 
{
    // Method to calculate BMI and status
    public static String[] calculateBMIStatus(double weightKg, double heightCm)
	{
        double heightM = heightCm / 100.0; 
        double bmi = weightKg / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; 

        String status;
        if (bmi < 18.5)
		{	
			status = "Underweight";
		}
        else if (bmi < 25)
		{		
			status = "Normal weight";
		}
        else if (bmi < 30) 
		{
			status = "Overweight";
		}
        else 
		{
			status = "Obese";
		}
		
        return new String[]{"Height: " + heightCm + " cm", "Weight: " + weightKg + " kg", "BMI: " + bmi,"Status: " + status};
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = 10; 
        double[][] heightWeight = new double[n][2];

        for (int i = 0; i < n; i++) 
		{
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = sc.nextDouble();
        }

        // Calculate and print BMI and status for each person
        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nPerson " + (i + 1) + ":");
            String[] result = calculateBMIStatus(heightWeight[i][0], heightWeight[i][1]);
            for (String s : result) 
			{
                System.out.println(s);
            }
        }
    }
}
