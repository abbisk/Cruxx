package com.company.Lecture7;

import java.util.Arrays;

public class class2 {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        System.out.println(find(arr,99,0));
//        System.out.println(findindex(arr,4,0));
//        System.out.println(checkshort(arr,0));
//        pattern1(4,0);
        /////////////// For bubbleshort
        int ar[] = {5,4,3,2,1};
        int i = ar.length-1;
        bubblesort(ar,i,0);
        System.out.println(Arrays.toString(ar));
        String s  = "abc";
        subsequence("","abc");
    }

    public static boolean find(int arr[],int element ,int index) {
        if(index== arr.length){
            return false;
        }
        if(arr[index]==element){
            return true;
        }
        return find(arr, element,index+1);

    }
    public static int findindex(int arr[],int element ,int index) {
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==element){
            return index;
        }
        return findindex(arr, element,index+1);

    }

    public static boolean checkshort(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;
        }

        return checkshort(arr,index+1);
    }

    public static void pattern1(int row,int column) {
        if (row==0){
            return;
        }
        if (column==row){
            System.out.println();
            pattern1(row-1,0);
            return;
        }
        System.out.print("*");
        pattern1(row,column+1);

    }
    public static void bubblesort(int ar[],int i,int j) {
        if(i==0){
            return;
        }
        if (i == j) {
            bubblesort(ar,i-1,0);
            return;
        }
        if(ar[j]>ar[j+1]){
            int temp = ar[j];
            ar[j]= ar[j+1];
            ar[j+1]= temp;
        }
        bubblesort(ar,i,j+1);


    }

    public static void subsequence(String processed , String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subsequence(processed+ch,unprocessed);
        subsequence(processed+(int)ch,unprocessed);
        subsequence(processed,unprocessed);

    }
}
