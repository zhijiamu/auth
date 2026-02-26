package org.test.auth;

public class leetcode1_1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lenght = m + n;
        int count = 0;
        for (int i = 0; i < lenght; i++) {
            if (m > 0 && n > 0 && nums2[n - 1] >= nums1[m - 1]) {
                count++;
                nums1[lenght - count] = nums2[n - 1];
                n--;
            } else if (m > 0 && n > 0 && nums2[n - 1] < nums1[m - 1]) {
                count++;
                nums1[lenght - count] = nums1[m - 1];
                m--;
            }
        }

    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        print(nums1);
        merge(nums1, m, nums2, n);
        System.out.println("MERGE后的结果是：");
        print(nums1);
    }

}
