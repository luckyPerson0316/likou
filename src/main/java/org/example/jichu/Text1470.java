package org.example.jichu;

import java.util.Arrays;

public class Text1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));

    }

    public static int[] shuffle(int[] nums, int n) {
//        int i=1;
//        int j=0;
        int[] a = new int[2*n];
        //循环里一次存两个元素
        for (int i = 0; i <n ; i++){
            a[2*i] = nums[i];
            a[2*i+1]=nums[i+n];
        }
        return a;

    }
}
