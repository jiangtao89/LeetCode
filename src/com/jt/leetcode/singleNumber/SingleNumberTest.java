package com.jt.leetcode.singleNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jiangtao on 16/5/23.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class SingleNumberTest {


    @Test
    public void test_1_2_2_2() {

        SingleNumber singleNumber = new SingleNumber();

        int[] nums = new int[] {1, 2, 2, 2};

        Assert.assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    public void test_2_2_3_2() {

        SingleNumber singleNumber = new SingleNumber();

        int[] nums = new int[] {2,2,3,2};

        Assert.assertEquals(3, singleNumber.singleNumber(nums));
    }
}
