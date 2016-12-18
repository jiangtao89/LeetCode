package com.jt.leetcode.twosum;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by jiangtao on 18/12/2016.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class TwoSumTest {

    @Test
    public void test_9() {
        int[] nums = {2, 7, 11, 15};
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, TwoSum.twoSum(nums, 9));
    }

}