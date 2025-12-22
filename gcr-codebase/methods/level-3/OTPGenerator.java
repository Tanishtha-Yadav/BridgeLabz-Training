import java.util.*;
public class OTPGenerator
{
    // Method to generate OTP
    public static int generateOTP() 
	{
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areUnique(int[] otps) 
	{
        for (int i = 0; i < otps.length; i++) 
		{
            for (int j = i + 1; j < otps.length; j++) 
			{
                if (otps[i] == otps[j]) 
				{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) 
	{
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++)
		{
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        // Check uniqueness
        if (areUnique(otpArray))
		{
            System.out.println("All OTPs are unique.");
        } 
		else
		{
            System.out.println("Some OTPs are repeated.");
        }
    }
}
