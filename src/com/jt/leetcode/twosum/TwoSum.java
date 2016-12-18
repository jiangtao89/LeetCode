package com.jt.leetcode.twosum;

import java.util.HashMap;

/**
 * Created by jiangtao on 18/12/2016.
 *
 * @author jiang.tao
 * @version 1.0.0
 *          <p>
 *          Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *          <p>
 *          You may assume that each input would have exactly one solution.
 *          <p>
 *          Example:
 *          Given nums = [2, 7, 11, 15], target = 9,
 *          <p>
 *          Because nums[0] + nums[1] = 2 + 7 = 9,
 *          return [0, 1].
 *          UPDATE (2016/2/13):
 *          The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if (nums == null || nums.length < 2) {
            return result;
        }

        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
