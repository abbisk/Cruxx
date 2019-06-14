package com.company.Lecture7;

public class class2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(find(arr,99,0));
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
}
