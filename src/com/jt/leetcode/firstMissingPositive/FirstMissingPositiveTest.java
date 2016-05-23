package com.jt.leetcode.firstMissingPositive;

import com.jt.leetcode.firstMissingPositive.FirstMissingPositive;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jiangtao on 16/5/20.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class FirstMissingPositiveTest {

    @Test
    public void test_1() {

        int[] nums = {1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        Assert.assertEquals(2, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void test_1_2_0() {

        int[] nums = {1, 2, 0};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        Assert.assertEquals(3, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void test_3_4__1_1() {

        int[] nums = {3,4,-1,1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        Assert.assertEquals(2, firstMissingPositive.firstMissingPositive(nums));
    }


    @Test
    public void test_3_2_4_5_3_4_1__1() {

        int[] nums = {3, 2, 4, 5, 3,4,-1,1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        Assert.assertEquals(6, firstMissingPositive.firstMissingPositive(nums));
    }
}
