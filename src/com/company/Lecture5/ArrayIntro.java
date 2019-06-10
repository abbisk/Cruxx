package com.company.Lecture5;

import java.sql.SQLOutput;
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
        incby2(nums);
        }

    public static void display1(int[] nums) {
        for (int i =0; i<nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }
    public static void swap(int[] nums, int first, int second){
            int t = nums[first];
            nums[first] = nums[second];
            nums[second]=t;
        }

    public static void incby2(int[] nums) {
        for (int i =0; i<nums.length; i++){
            nums[i]= nums[i]+2;
            System.out.print(nums[i]+" ");
        }
    }

    }
