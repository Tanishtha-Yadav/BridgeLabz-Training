package com.sortingalgorithm;

import java.util.Arrays;

public class SelectionSortExam {

    public static void selectionSort(int[] scores) 
    {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;

            // Find index of minimum element
            for (int j = i + 1; j < n; j++) 
            {
                if (scores[j] < scores[minIndex]) 
                {
                    minIndex = j;
                }
            }

         
            if (minIndex != i) 
            {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] examScores = {78, 92, 65, 88, 70};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("After Sorting: " + Arrays.toString(examScores));
    }
}

