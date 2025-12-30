import java.util.*;
class TwoSum 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
		{
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        for (int i = 0; i < nums.length - 1; i++) 
		{
            for (int j = i + 1; j < nums.length; j++) 
			{
                if (nums[i] + nums[j] == target) 
				{
                    System.out.println("Indices: " + i + " " + j);
                    return;
                }
            }
        }

        System.out.println("No valid pair found");
        sc.close();
    }
}
