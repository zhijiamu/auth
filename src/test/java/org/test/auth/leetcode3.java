package org.test.auth;

public class leetcode3 {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int remove = 0;
        for (int i = 0; i < nums.length; i = k + remove) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                remove++;
                while (nums[i] == nums[remove + k + 1] && remove + i + 1 < nums.length) {
                    remove++;
                }

            }
            nums[k] = nums[remove + k];
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        leetcode1.print(nums);
        System.out.println(removeDuplicates(nums));
        leetcode1.print(nums);
    }

}
