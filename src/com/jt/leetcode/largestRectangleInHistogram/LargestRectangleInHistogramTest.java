package com.jt.leetcode.largestRectangleInHistogram;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jiangtao on 16/5/29.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class LargestRectangleInHistogramTest {

    @Test
    public void test_1() {

        int[] heights = new int[]{1};

        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();

        Assert.assertEquals(1, histogram.largestRectangleArea(heights));
    }

    @Test
    public void test_0() {

        int[] heights = new int[]{0};

        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();

        Assert.assertEquals(0, histogram.largestRectangleArea(heights));
    }

    @Test
    public void test_1_2() {

        int[] heights = new int[]{1, 2};

        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();

        Assert.assertEquals(2, histogram.largestRectangleArea(heights));
    }

    @Test
    public void test_2_1_5() {

        int[] heights = new int[]{2,1,5};

        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();

        Assert.assertEquals(5, histogram.largestRectangleArea(heights));
    }

    @Test
    public void test_2_1_5_6_2_3() {

        int[] heights = new int[]{2,1,5,6,2,3};

        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();

        Assert.assertEquals(10, histogram.largestRectangleArea(heights));
    }
}
