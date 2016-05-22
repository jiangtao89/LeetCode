package com.jt.leetcode.coinchange.test;

import com.jt.leetcode.coinchange.CoinChange;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jiangtao on 16/5/19.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class CoinChangeTest {

//    @Test
//    public void testError() {
//
//        CoinChange coinChange = new CoinChange();
//
//        int[] coins = new int[]{2};
//        int amount = 3;
//
//        Assert.assertEquals(-1, coinChange.coinChange(coins, amount));
//    }
//
//    @Test
//    public void testSuccessOne() {
//
//        CoinChange coinChange = new CoinChange();
//
//        int[] coins = new int[]{2};
//        int amount = 2;
//
//        Assert.assertEquals(1, coinChange.coinChange(coins, amount));
//    }
//
//    @Test
//    public void testSuccessTwo() {
//
//        CoinChange coinChange = new CoinChange();
//
//        int[] coins = new int[]{2, 3};
//        int amount = 5;
//
//        Assert.assertEquals(2, coinChange.coinChange(coins, amount));
//    }

    @Test
    public void testSuccessThree() {

        CoinChange coinChange = new CoinChange();

        int[] coins = new int[]{1, 2, 5};
        int amount = 11;

        Assert.assertEquals(3, coinChange.coinChange(coins, amount));
    }

//
//    @Test
//    public void testSuccessFour() {
//
//        CoinChange coinChange = new CoinChange();
//
//        int[] coins = new int[]{186,419,83,408};
//        int amount = 6249;
//
//        Assert.assertEquals(20, coinChange.coinChange(coins, amount));
//    }

    @Test
    public void testSort() {

        int[] coins = new int[] {2, 1};
        Arrays.sort(coins);

        Assert.assertArrayEquals(new int[]{1, 2}, coins);
    }
}
