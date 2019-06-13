package com.company.Lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter positions which you want to interchange");
//        int first = obj.nextInt();
//        int second = obj.nextInt();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        display1(nums);
        System.out.println("\n");
//        swap(nums,first,second);
//        display1(nums);
//        incby2(nums);
        }

    public static void display1(int[] nums) {  // Display function to print array also call traverse array
        for (int i =0; i<nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }
    public static void swap(int[] nums, int first, int second){ // Function to swap array to elements
            int t = nums[first];
            nums[first] = nums[second];
            nums[second]=t;
        }

    public static void incby2(int[] nums) { // Function to add 2 in every element of array
        for (int i =0; i<nums.length; i++){
            nums[i]= nums[i]+2;
            System.out.print(nums[i]+" ");
        }
    }

    public static void reverse(int[] nums) {  //Function to reverse the full array
        for (int i = 0; i <nums.length/2 ; i++) {
            int temp = nums[i];
            nums[i] =nums[nums.length-i-1];
            nums[nums.length-i-1]= temp;
//            swap(nums,i,nums.length-i-1);

        }

    }
    public static int maxindex(int ar[],int start,int end){
        int max=0;
        for (int i = start; i <=end; i++) {
            if(ar[i]>ar[max]){
                max=i;
            }
        }
        return max;
    }

    }
