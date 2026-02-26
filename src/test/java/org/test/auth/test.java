package org.test.auth;

public class test {
    public static void main(String[] args) {
        int count = 7;
        int[] a = new int[]{90, 90, 80, 80, 80, 80, 70};
        int rank = 0;
        for (int i = 0; i < count; i++) {
            if (i >= 1 && a[i] < a[i - 1]) rank = i;
            System.out.println("第" + rank + "名，分数" + a[i]);
        }
    }
}
