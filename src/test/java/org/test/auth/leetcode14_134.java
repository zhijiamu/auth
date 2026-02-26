package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode14_134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index=-1;
        int n=gas.length;
        for(int i=0;i<n;i++)
        {
            int left=0;
            index=i;
            int offset=0;
            left=gas[i];
            while(offset<n)
            {
                left=left-cost[(i+offset)%n];
                if(left>=0){ offset++;}
                else {index=-1;break;}
                left=left+gas[(i+offset)%n];
            }
            if(left>=0) return index;
        }
        return index;

    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
       // int[] gas = {2,3,4};
        int[] cost = {3,4,5,1,2};
       // int[] cost =  {3,4,3};
        System.out.println("maxprofix"+canCompleteCircuit(gas,cost));
    }
}
