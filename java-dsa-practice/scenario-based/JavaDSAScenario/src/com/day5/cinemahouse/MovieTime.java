package com.day5.cinemahouse;
import java.time.LocalTime;
import java.util.Arrays;

public class MovieTime {
	
	public static void timeSort(LocalTime time[])
	{
		int n=time.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(time[j].isAfter(time[j+1]))
				{
					LocalTime temp = time[j];
					time[j]=time[j+1];
					time[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(time));
	}
	
	public static void main(String[] args)
	{
		LocalTime timing[]= {
				LocalTime.of(10,00), //10:00
				LocalTime.of(16,30), //04:30 
				LocalTime.of(14,10), //14:10
				LocalTime.of(12,10), //12:10
				LocalTime.of(10,25), //10:25
				LocalTime.of(17,30), //05:30
				LocalTime.of(19,45), //07:45
				LocalTime.of(20,10), //08:10
				LocalTime.of(15,10), //03:10
				LocalTime.of(13,30), //01:30
		};
		System.out.println("Movie timings in sorted ways");
		timeSort(timing);
	}

}
