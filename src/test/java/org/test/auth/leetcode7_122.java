package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode7_122 {
    public static int maxProfit(int[] nums) {
        int maxProfit = 0;
        int profit = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1])
            {  profit=nums[i+1]-nums[i];
            maxProfit=maxProfit+profit;}
        }
        return maxProfit;
    }

    public static void main(String[] args) {
       // int[] nums ={7,1,5,3,6,4};
        int[] nums={7,1,5,3,6,4};
        //int[] nums={1,2,3,4,5};
        leetcode1.print(nums);
        System.out.println("maxprofix"+maxProfit(nums));
    }
}
