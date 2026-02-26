package org.test.auth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class leetcode14_135 {
    public static int candy(int[] ratings) {
        int count=1;
        int candy=1;
        for(int i=0;i<ratings.length-1;i++)
        {
            if(ratings[i]<ratings[i+1])
            {
                candy++;
                count=count+candy;
            }else if(ratings[i]==ratings[i+1])
            {
                count=count+1;
                candy=1;
            }else if(ratings[i]>ratings[i+1])
            {
                if(candy-1==0)
                {
                    count=count+i+1+1;
                    candy=1;
                }else{
                count=count+candy-1;}
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        //int[] ratings = {1,2,2};
        System.out.println("candies maximum "+candy(ratings));
    }
}
