package com.company.Lecture5;

public class Searching {
    public static void main(String[] args) {
        int[] nums = {4, 5, 78, 456, 4, 24};
        int value = linear(nums, 5);
        System.out.println(value);
    }

    public static int linear(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
