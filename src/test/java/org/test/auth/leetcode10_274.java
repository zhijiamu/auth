package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode10_274 {
    public static int hIndex(int[] nums) {
        int h=0;
        h=nums.length;
        int count=0;
        while(h>0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= h) count++;
                if (count >= h) return h;
            }
            h--;
            count=0;
        }
        return h;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        leetcode1.print(citations);
        System.out.println("maxprofix"+hIndex(citations));
    }
}
