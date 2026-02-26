package org.test.auth;

public class leetcode2 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length - k; i++) {
            if (val == nums[i] && nums.length - k > i) {
                while (val == nums[nums.length - k - 1]) {
                    nums[i] = nums[nums.length - k - 1];
                    nums[nums.length - k - 1] = val;
                    k++;
                }
                nums[i] = nums[nums.length - k - 1];
                nums[nums.length - k - 1] = val;
                k++;

            }
        }
        return k;
    }

    public static void main(String[] args) {
  /*      int[] nums ={3,2,2,3};
        int val = 3;
        leetcode1.print(nums);
        System.out.println(removeElement(nums,3));
        leetcode1.print(nums);*/

     /*   int[] nums ={3,2,3,3};
        int val = 3;
        leetcode1.print(nums);
        System.out.println(removeElement(nums,3));
        leetcode1.print(nums);*/

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        leetcode1.print(nums);
        System.out.println(removeElement(nums, val));
        leetcode1.print(nums);
    }

}
