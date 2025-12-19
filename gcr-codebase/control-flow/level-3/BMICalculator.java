import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meter
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Determine status
        String status;

        if(bmi<=18.4)
		{
            status = "Underweight";
        }
		else if(bmi<=24.9) 
		{
            status = "Normal";
        } 
		else if(bmi<=39.9)
		{
            status = "Overweight";
        } 
		else 
		{
            status = "Obese";
        }

        // Output
        System.out.println("\nBMI = " + bmi);
        System.out.println("Weight Status = " + status);

        input.close();
    }
}