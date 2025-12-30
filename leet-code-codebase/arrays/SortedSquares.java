import java.util.*;
class SortedSquares
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

        for (int i = 0; i < nums.length; i++) 
		{
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        System.out.println("Sorted squares:");
        for (int val : nums) 
		{
            System.out.print(val + " ");
        }

        sc.close();
    }
}
