import java.util.*;
public class BonusCalculator
{
    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int employees)
	{
        double[][] data = new double[employees][2];
        Random rand = new Random();

        for (int i = 0; i < employees; i++) 
		{
            data[i][0] = 10000 + rand.nextInt(90000); 
            data[i][1] = 1 + rand.nextInt(10);        
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employeeData) 
	{
        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++)
		{
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5)
			{
                bonus = salary * 0.05;
            } 
			else
			{
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus; 
            result[i][1] = bonus;      
        }
        return result;
    }

    // Method to calculate and display totals in tabular format
    public static void displayReport(double[][] oldData, double[][] newData)
	{
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp  OldSalary  Years  Bonus    NewSalary");
        System.out.println("------------------------------------------");

        for (int i = 0; i < oldData.length; i++)
		{
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%3d  %9.0f  %5.0f  %7.0f  %9.0f%n",(i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.printf("TOTAL %9.0f        %7.0f  %9.0f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args)
	{
        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonus(employeeData);

        displayReport(employeeData, bonusData);
    }
}
