package com.company.Lecture10;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(msort(arr)));

    }

    public static int[] msort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = (arr.length)/2;

        int first[]=msort(Arrays.copyOfRange(arr,0,mid));
        int second[] = msort(Arrays.copyOfRange(arr,mid,arr.length));


        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length+second.length];
        int i =0;
        int j = 0;
        int k = 0;
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]= first[i];
                i++;
                k++;
            }
            else {
                mix[k]=second[j];
                i++;
                k++;
            }
            while(i < first.length){
                mix[k]= first[i];
                i++;
                k++;
            }
            while (j<second.length){
                mix[k]= first[j];
                i++;
                k++;
            }


        }
        return mix;
    }
}
