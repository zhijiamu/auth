package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode16_42 {
    public static int trap(int[] height) {
        int count=0;
        int left=0;
        int occpy=0;
        int right=1;
        //define two index of left and right
        while(height[left]==0&&right<height.length)
        {
            left++;
            right=left+1;
        }
        while(right<height.length&&right!=height.length-1)
        {
            if(height[right]>=height[left])
            {
                for(int i =1;i<left-right;i++)
                {
                    occpy=occpy+height[left+i];
                }
                count=count+(right-left-1)*Math.min(height[right],height[left])-occpy;
                occpy=0;
                left=right;
                right++;
            }
            else
            {
                if(right+1<height.length){ right++;}
                else{
                    right=height.length-1;
                }
            }
        }
        if(right<height.length&&height[left]>height[right]&&height[right]!=0)
        {
            for(int i =1;i<left-right;i++)
            {
                occpy=occpy+height[left+i];
            }
            count=count+(left-right-1)*Math.min(height[right],height[left])-occpy;
        }
        return count;
    }

    public static void main(String[] args) {
        //int[] ratings = {1,0,2};
        //int[] ratings = {1,2,2};
        //int[] ratings={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] ratings={4,2,0,3,2,5};
        System.out.println("trap "+trap(ratings));
    }
}
