import java.util.*;
public class CalculatorProgram{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Input operator
        System.out.print("Enter operator: ");
        String op = input.next();

        double result;

        // Perform calculation based on operator
        switch (op)
        {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if(second!=0)
                {
                    result=first/second;
                    System.out.println("Result: " + result);
                }
                else
                {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        // Close Scanner object
        input.close();
    }
}