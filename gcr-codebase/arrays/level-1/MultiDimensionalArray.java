import java.util.*;
public class MultiDimensionalArray{
	public static void main(String[]args)
	{
		// Scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		// user input of rows and column
		System.out.println("Enter Row : ");
		int row = sc.nextInt();
		System.out.println("Enter Column : ");
		int column = sc.nextInt();
		
		int array[][]=new int[row][column];
		
		// user input elements in 2D array
		System.out.println("Enter Elements : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}

		// Displaying 2D Array
		System.out.println("2D Array : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+" ");
			}
		}
		
		int size=row*column;
		int index=0;
		
		// Copying elements from 2D array to  1D Array
		int singleArray[]=new int[size];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				singleArray[index]=array[i][j];
				index++;
			}
		}
		
		System.out.println();
		
		// Displaying 1D array
		System.out.println("1D Array : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(singleArray[i]+" ");
		}
		
		sc.close();
	}
}