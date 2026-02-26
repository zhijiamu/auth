package org.test.auth;

public class leetcode4_80 {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int remove = 0;
        for (int i = 0; i < nums.length; i = k+remove) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                while (remove + i + 2 < nums.length && nums[i] == nums[remove + i + 2]) {
                    remove++;
                }
                nums[k] = nums[i];
                nums[k+1] = nums[i+1];
                k=k+2;
            } else {
                nums[k++] = nums[i++];
            }
        }
        return k--;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        leetcode1.print(nums);
        System.out.println(removeDuplicates(nums));
        leetcode1.print(nums);
    }

}
