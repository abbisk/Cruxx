package com.company.Lecture5;

import java.util.Arrays;

public class Shorting {
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        bubble(nums);
        ArrayIntro.display1(nums);
        insersion(nums);
        System.out.println("\n");
        ArrayIntro.display1(nums);
//        System.out.println(Arrays.toString(nums));
    }

    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    ArrayIntro.swap(nums, j, j + 1);
                }
            }
        }

    }

    public static void insersion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    ArrayIntro.swap(nums, j, j - 1);
                }
            }
        }
    }
    public static void selection(int nums[]){
        for (int i = 0; i <nums.length ; i++) {
            int max=ArrayIntro.maxindex(nums,0,nums.length-i-1);
            ArrayIntro.swap(nums,max,nums.length-i-1);

        }
    }
}