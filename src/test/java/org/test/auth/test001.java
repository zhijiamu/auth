package org.test.auth;

public class test001 {

    public static void main(String[] args) {
        test001 test = new test001();
        int[] nums1 = {1, 8};
        int[] nums2 = {2, 4};

        test.findMedianSortedArrays(nums1, nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int count = 0;
        int[] nums3 = new int[length];
        //
        for (int i = 0; i < nums1.length; i++)
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] <= nums2[j]) {
                    nums3[count] = nums1[i];
                    count++;
                    break;
                } else if (nums1[i] > nums2[j]) {
                    nums3[count] = nums2[j];
                    count++;
                    break;
                }
            }
        if (count < length - 1) {
            for (int i = 0; i < count; i++) {
                nums3[count] = nums2[nums2.length - count];
                count++;
            }
        }
        System.out.println(nums3.length);
        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }
        return 1;
    }
}
