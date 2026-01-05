package com.sortingalgorithm;

import java.util.Arrays;

public class MergeSortBook {

    // Merge Sort function
    public static void mergeSort(int[] prices, int left, int right)
    {
        if (left < right) 
        {
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(prices, left, mid);

            // Sort right half
            mergeSort(prices, mid + 1, right);

            // Merge both halves
            merge(prices, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] prices, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            leftArray[i] = prices[left + i];
        }
        
        for (int j = 0; j < n2; j++)
        {
            rightArray[j] = prices[mid + 1 + j];
        }
        
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) 
        {
            if (leftArray[i] <= rightArray[j]) 
            {
                prices[k] = leftArray[i];
                i++;
            }
            else 
            {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) 
        {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) 
    {
        int[] bookPrices = {450, 1200, 299, 799, 150};

        System.out.println("Before Sorting: " + Arrays.toString(bookPrices));

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(bookPrices));
    }
}
