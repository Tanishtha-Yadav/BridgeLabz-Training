import java.util.*;
public class DistanceAndLineEquation
{
    // Method to find Euclidean distance
    public static double findDistance(double x1, double y1,
                                      double x2, double y2)
	{
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) 
    {
        double[] result = new double[2];

        double m = (y2 - y1) / (x2 - x1); 
        double b = y1 - (m * x1);         

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance = %.2f%n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f%n",
                line[0], line[1]);

        sc.close();
    }
}
