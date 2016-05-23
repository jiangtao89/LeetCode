package com.jt.leetcode.grayCode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by jiangtao on 16/5/23.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class GrayCodeTest {

    @Test
    public void test_1() {

        GrayCode grayCode = new GrayCode();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);    // 0
        list.add(1);    // 1

        Assert.assertArrayEquals(list.toArray(), grayCode.grayCode(1).toArray());
    }

    @Test
    public void test_2() {

        GrayCode grayCode = new GrayCode();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);    // 00
        list.add(1);    // 01
        list.add(3);    // 11
        list.add(2);    // 10

        Assert.assertArrayEquals(list.toArray(), grayCode.grayCode(2).toArray());
    }
}
