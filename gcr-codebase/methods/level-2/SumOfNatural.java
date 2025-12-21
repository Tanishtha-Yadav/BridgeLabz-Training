import java.util.*;
public class SumOfNatural
{
    // recursive method to find sum
    public static int recursiveSum(int n)
	{
        if(n==0)
		{
            return 0;
        }
        return n + recursiveSum(n-1);
    }

    // method to find sum using formula
    public static int formulaSum(int n)
	{
        return n*(n+1)/2;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        if(n<=0)
		{
            System.out.println("Enter a number: ");
            return;
        }

        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Sum using recursion: "+sumRecursive);
        System.out.println("Sum using formula: "+sumFormula);

        if(sumRecursive==sumFormula)
		{
            System.out.println("Both results are correct and equal");
        }
		else
		{
            System.out.println("Results are not equal");
        }
    }
}
