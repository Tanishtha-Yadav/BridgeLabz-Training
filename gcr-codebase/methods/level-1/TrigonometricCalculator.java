import java.util.*;
public class TrigonometricCalculator{
    // method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunction(double angle) 
	{
        double radians = Math.toRadians(angle);

        double[] result = new double[3];
        result[0] = Math.sin(radians);  
        result[1] = Math.cos(radians);  
        result[2] = Math.tan(radians);  
        return result;
    }

    public static void main(String[]args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] values = calculateTrigonometricFunction(angle);

        System.out.println("Sine : " + values[0]);
        System.out.println("Cosine : " + values[1]);
        System.out.println("Tangent : " + values[2]);
    }
}
