import java.util.*;

class CelsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}

