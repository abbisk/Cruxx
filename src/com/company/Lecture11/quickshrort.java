//package com.company.Lecture11;
//
//import java.util.Arrays;
//
//public class quickshrort {
//    public static void main(String[] args) {
//        int arr[] = {5,4,3,2,1};
//        arr = quick(arr, 5,1);
//        System.out.println(Arrays.toString(quick(arr)));
//
//    }
//
//    public static void quick(int arr[], int start,int end) {
//
//        if(end<=start){
//            return;
//        }
//        int pivot = end -1;
//
//        pivot = pivotadjust(arr,start,pivot);
//
//        quick(arr,start,pivot);
//        quick(arr,pivot+1,end);
//
//
//    }
//
//    private static int pivotadjust(int[] arr, int start, int pivot) {
//        int i = start;
//        int j = start;
//
//        for (int i = start; i < pivot; i++) {
//            if(arr[i]<arr[pivot]){
//                int t = arr[i];
//                arr[i]=arr[j];
//                arr[j]=t;
//                j++;
//            }
//
//        }
//        int t = arr[j];
//        arr[j]=arr[pivot];
//        arr[pivot]=t;
//
//        return j;
//    }
//}
