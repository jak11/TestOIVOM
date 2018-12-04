package com.movio.question1;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,5};
        int[] arr2 = {1,2,3,4};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }

    /**
     * Merge two sorted arrays.
     * @return
     */
    public static int[] merge(int[] arr1, int[] arr2){
        if(arr1 == null && arr2 == null) return null;
        if(arr1 == null) return arr2;
        if(arr2 == null) return arr1;

        int len1 = arr1.length;
        int len2 = arr1.length;
        int[] resultantArray = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        //Traverse both array
        while (i<len1 && j <len2)
        {
            if (arr1[i] < arr2[j])
                resultantArray[k++] = arr1[i++];
            else
                resultantArray[k++] = arr2[j++];
        }

        //Store remaining elements of first array
        while (i < len1) {
            resultantArray[k++] = arr1[i++];
        }
        //Store remaining elements of second array
        while (j < len2) {
            resultantArray[k++] = arr2[j++];
        }

        return resultantArray;
    }
}
