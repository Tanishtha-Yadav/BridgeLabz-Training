import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args){
		// Scanner object for user input
        Scanner sc = new Scanner(System.in);

		// User input 
        System.out.print("Enter base in centimeter : ");
        double base = sc.nextDouble();
        System.out.print("Enter height in centimeter : ");
        double height = sc.nextDouble();

		// Calculation  of area of triangle
        double areaCm = 0.5*base*height;
        double areaInches = areaCm/(2.54*2.54);
		
		// displaying results
        System.out.println("The Area of the triangle in sq inch is " + areaInches + " and sq cm is " + areaCm);
    }
}