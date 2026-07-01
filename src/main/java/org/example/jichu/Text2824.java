package org.example.jichu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Text2824 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        System.out.println(countPairs(list, target));

    }
    public static int countPairs(List<Integer> nums, int target) {
        int num=0;
        int m = nums.toArray().length;
        int left = 0;
        int right = m-1;
        Collections.sort(nums);
        Integer[] a = nums.toArray(new Integer[0]);
        while(left<right){
            if (a[left]+a[right]<target){
                num+=right-left;
                left++;
            }else{
                right--;

        }
        }

        return num;
    }
}
