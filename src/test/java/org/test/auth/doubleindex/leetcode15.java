package org.test.auth.doubleindex;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Slf4j
public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums)  {
        Arrays.sort(nums);
        List list=new ArrayList();

        for(int i=0;i<nums.length-2;i++)
            for(int j=i+1;j<nums.length-1;j++)
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        int[] sort=new int[nums.length];
                        sort[0]=nums[i];
                        sort[1]=nums[j];
                        sort[2]=nums[k];
                        list.add(sort);
                    }
                }
        for(int i=0;i<list.size()-1;i++)
        {
            int[] list1= (int[]) list.get(i);
            int[] list2=(int[]) list.get(i+1);
        }


        return list;
    }

    public static void main(String[] args) {
        //int[] ratings = {1,0,2};
        //int[] ratings = {1,2,2};
        //int[] ratings={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("list "+threeSum(nums));
    }
}
