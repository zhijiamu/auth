package org.test.auth;

public class leetcode1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int position = 0;
        int offsetcount = m;
        if (m == 0) {
            for (int i = 0; i < n; i++)
                insert(nums1, nums2[i], i, 0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = position; j < m + position; j++) {
                if (nums2[i] >= nums1[j] && j + 1 < m && nums2[i] < nums1[j + 1]) {
                    insert(nums1, nums2[i], j + 1, m - j - 1);
                    position++;
                    break;
                }
                if (nums2[i] >= nums1[j] && j + 1 > m) {
                    insert(nums1, nums2[i], j + 1, m - j - 1);
                    position++;
                    break;
                } else {
                    position++;
                    offsetcount--;
                }
            }

        }
    }

    public static void insert(int[] nums, int insertelement, int insertpostion, int offsetcount) {
        for (int i = offsetcount; i > 0; i--) {
            nums[insertpostion + i] = nums[insertpostion + i - 1];
        }
        nums[insertpostion] = insertelement;
    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
   /*     int[] nums = {1, 2, 3,0};
        print(nums);
        insert(nums,2,2,1);
        print(nums);*/


  /*      int[] nums = {1, 2, 3,0};
        print(nums);
        insert(nums,4,3,0);
        print(nums);*/

      /*  int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m= 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        print(nums1);
        merge(nums1,m,nums2,n);
        System.out.println("MERGE后的结果是：");
        print(nums1);*/

  /*      int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        print(nums1);
        merge(nums1,m,nums2,n);
        System.out.println("MERGE后的结果是：");
        print(nums1);*/

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        print(nums1);
        merge(nums1, m, nums2, n);
        System.out.println("MERGE后的结果是：");
        print(nums1);
    }

}
