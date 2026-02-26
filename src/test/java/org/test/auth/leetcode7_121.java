package org.test.auth;

public class leetcode7_121 {
    public static int maxProfit(int[] nums) {
        int maxProfit=0;
        for(int i=0;i<nums.length-1;i++)
        {
         for(int j=i+1;j<nums.length;j++)
          if(maxProfit<(nums[j]-nums[i]))
          {
              maxProfit=nums[j]-nums[i];
          }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
       // int[] nums ={7,1,5,3,6,4};
        int[] nums={7,6,4,3,1};
        leetcode1.print(nums);
        System.out.println("maxprofix"+maxProfit(nums));
    }
}
