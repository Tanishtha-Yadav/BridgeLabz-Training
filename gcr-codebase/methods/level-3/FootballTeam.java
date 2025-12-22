import java.util.*;
public class FootballTeam
{
    // Method to generate random heights 
    public static int[] generateRandomHeights(int size) 
	{
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) 
		{
            heights[i] = 150 + (int)(Math.random() * 101);
        }
        return heights;
    }

    // Method for sum of elements
    public static int sumArray(int[] array)
	{
        int sum = 0;
        for (int i = 0; i < array.length; i++)
		{
            sum += array[i];
        }
        return sum;
    }

    // Method for mean height
    public static double meanHeight(int[] array)
	{
        int sum = sumArray(array);
        return (double) sum / array.length;
    }

    // Method for shortest height
    public static int shortestHeight(int[] array) 
	{
        int min = array[0];
        for (int i = 1; i < array.length; i++) 
		{
            min = Math.min(min, array[i]);
        }
        return min;
    }

    // Method for tallest height
    public static int tallestHeight(int[] array) 
	{
        int max = array[0];
        for (int i = 1; i < array.length; i++)
		{
            max = Math.max(max, array[i]);
        }
        return max;
    }

    public static void main(String[] args)
	{
        int[] heights = generateRandomHeights(11);

        System.out.println("Heights of players (cm): " + Arrays.toString(heights));
        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.println("Mean height: " + meanHeight(heights) + " cm");
    }
}
