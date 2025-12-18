import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Operations based on precedence:
        // 1. b*c happens first, then add a
        int res1 = a + b * c; 
        // 2. a*b happens first, then add c
        int res2 = a * b + c; 
        // 3. a/b happens first (integer division), then add c
        int res3 = c + a / b; 
        // 4. a%b happens first, then add c
        int res4 = a % b + c; 

		//Displaying Result
        System.out.println("The results of Int Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
    }
}