package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode12_238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int offset=1;
            answer[i]=nums[(i+offset)%nums.length];
            while(offset<nums.length-1)
            {
                answer[i]=answer[i]*nums[(i+offset+1)%nums.length];
                offset++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {1,2,3,4};
        leetcode1.print(citations);
        System.out.println("maxprofix"+productExceptSelf(citations));
        leetcode1.print(productExceptSelf(citations));
    }
}
