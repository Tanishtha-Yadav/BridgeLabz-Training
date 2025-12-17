import java.util.*;

public class FindAverage{
	public static void main(String[]args)
	{
		int math = 94;
		int physics = 95;
		int chemistry = 96;
		int total = math+physics+chemistry;
		double average = (total/300.0)*100;
		System.out.println("Sam's average mark in PCM is "+average);
	}
}