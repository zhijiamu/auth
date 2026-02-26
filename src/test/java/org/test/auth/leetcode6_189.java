package org.test.auth;

public class leetcode6_189 {
    public static void rotate(int[] nums, int k) {
        if(k> nums.length)
            k=k% nums.length;
        int count = gcd(k, nums.length);
        for(int i=0;i<count;i++)
        {
            int current=i;
            int start=i;
            int end=nums.length;
            int b=nums[start];
            int store=0;
            do
            {   current=(current+k)%end;
                store=nums[current];
                nums[current]=b;
                b=store;
            }while(start!=current);
        }
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        System.out.println("before rotate");
        leetcode1.print(nums);
        rotate(nums,3);
        System.out.println("after rotate");
        leetcode1.print(nums);
    }

    public static int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

}
