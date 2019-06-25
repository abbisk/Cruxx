package com.company.Hackerblock.Recursion;

public class Recursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(find(arr,6,0));

    }

    public static boolean find(int arr[], int element, int index) {
        if(index==arr.length){
            return false;
        }
        if(arr[index]==element){
            return true;
        }
        return find(arr,element,index+1);
    }
}
