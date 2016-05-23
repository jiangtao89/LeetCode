package com.jt.leetcode.singleNumber;

/**
 * Created by jiangtao on 16/5/23.
 * <p>
 * {@link "https://leetcode.com/problems/single-number-ii/"}
 * <p>
 * <p>
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Subscribe to see which companies asked this question
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int size = nums.length; int result = 0;

        for (int i = 0; i < 32; i++) {

            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += (nums[j] >> i) & 1;
            }

            result |= (sum % 3) << i;
        }

        return result;

    }
}
