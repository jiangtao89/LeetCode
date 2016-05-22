package com.jt.leetcode.firstMissingPositive;

/**
 * Created by jiangtao on 16/5/20.
 *
 * {@link "https://leetcode.com/problems/first-missing-positive/"}
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 1;
        }

        int[] flags = new int[nums.length + 2];

        for (int num : nums) {
            if (num <= 0 || num > nums.length) {
                continue;
            }

            flags[num]++;
        }


        for (int i = 1; i < flags.length; i++) {
            if (flags[i] == 0) {
                return i;
            }
        }

        return 1;
    }
}
