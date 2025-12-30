import java.util.*;
public class BinarySearch 
{
    public static int search(int[] nums, int target) 
	{
        int low = 0;
        int high = nums.length - 1;

        while (high >= low) 
		{
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) 
			{
                return mid;
            }
			else if (target > nums[mid]) 
			{
                low = mid + 1;
            }
			else 
			{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) 
		{
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int result = search(nums, target);

        if (result != -1) 
		{
            System.out.println("Element found at index: " + result);
        }
		else
		{
            System.out.println("Element not found");
        }

        sc.close();
    }
}
