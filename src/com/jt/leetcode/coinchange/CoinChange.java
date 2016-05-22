package com.jt.leetcode.coinchange;

import java.util.Arrays;

/**
 * Created by jiangtao on 16/5/19.
 *
 * {@link "https://leetcode.com/problems/coin-change/"}
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] nCoins = new int[coins.length];
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int k = 0;
        for (int coin : coins) {
            if (coin < amount) {
                dp[coin] = 1;
                nCoins[k++] = coin;
            } else if (coin == amount) return 1;
        }
        if (nCoins.length == 1) {
            if (amount % coins[0] == 0) return amount / coins[0];
            return -1;
        }
        for (int i = 1; i <= amount; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                for (int coin : nCoins) {
                    int sum = i + coin;
                    if (sum <= amount) {
                        if (dp[sum] > dp[i] + 1)
                            dp[sum] = dp[i] + 1;
                    }
                    // displayArray(dp);
                }
            }
        }
        return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
    }

    private static void displayArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int n : array) {
            builder.append(n);
            builder.append('\t');
            builder.append('\t');
        }

        System.out.println(builder.toString());
    }

}
