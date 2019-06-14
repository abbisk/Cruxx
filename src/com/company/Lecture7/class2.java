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
        bubblesort(ar,0);
        System.out.println(Arrays.toString(ar));
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
    public static void bubblesort(int ar[],int row,int col) {
        if(ar.length==0){
            return;
        }
        bubblesort(ar,row-1,col+1);
        if(ar[col]>ar[col+1]){
            int temp = ar[col];
            ar[col]= ar[col+1];
            ar[col+1]= temp;
            bubblesort(ar,row-1,0);
            return;
        }


    }
}
