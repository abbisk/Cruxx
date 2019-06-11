package com.company.Lecture5;

public class Searching {
    public static void main(String[] args) {
        int[] nums = {4, 5, 78, 456, 4, 24};
        int value = lsearch(nums, 5);
        System.out.println(value);
        System.out.println(countinarr(nums,4));
    }

    public static int lsearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countinarr(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count = count + 1;
                System.out.println(count);
            }
        }
        return -1;
    }
}
