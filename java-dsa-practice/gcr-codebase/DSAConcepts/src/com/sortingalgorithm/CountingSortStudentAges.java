package com.sortingalgorithm;

import java.util.Arrays;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) 
    {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

 
        for (int age : ages) 
        {
            count[age - minAge]++;
        }

    
        for (int i = 1; i < range; i++) 
        {
            count[i] += count[i - 1];
        }

    
        for (int i = ages.length - 1; i >= 0; i--) 
        {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

    
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args)
    {
        int[] studentAges = {15, 12, 10, 18, 14, 12, 16};

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));

        countingSort(studentAges);

        System.out.println("After Sorting: " + Arrays.toString(studentAges));
    }
}

