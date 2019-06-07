package com.company.Lecture5;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        display(nums);
        swap(nums,1,8);
        display(nums);

        }

    public static void display(int[] nums) {
        for (int i =0; i<nums.length; i++){
            System.out.println(nums[i] +"\n");
        }
    }
    public static void swap(int[] nums, int first, int second){
            int t = nums[first];
            nums[first] = nums[second];
            nums[second]=t;
        }

    }
