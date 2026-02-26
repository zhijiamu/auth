package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode9_55 {
    public static boolean canJump(int[] nums) {
        boolean is= false;
        int current=nums[0];
        while(current<nums.length) {

            int nextindex = nums[current] + current;
            if(nextindex==nums.length-1) return is=true;
            if(nums[nextindex]==0) return is=false;
            current=nextindex;
            }
        return is;
    }

    public static void main(String[] args) {
       // int[] nums ={7,1,5,3,6,4};
       // int[] nums={2,3,1,1,4};
        int[] nums={3,2,1,0,4};
        //int[] nums={1,2,3,4,5};
        leetcode1.print(nums);
        System.out.println("maxprofix"+canJump(nums));
    }
}
