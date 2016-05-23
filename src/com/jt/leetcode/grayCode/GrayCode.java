package com.jt.leetcode.grayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangtao on 16/5/23.
 * <p>
 * {@link "https://leetcode.com/problems/gray-code/"}
 * {@link "https://zh.wikipedia.org/wiki/%E6%A0%BC%E9%9B%B7%E7%A0%81"}
 *
 * @author jiang.tao
 * @version 1.0.0
 *
 * Gray Code My Submissions QuestionEditorial Solution
Total Accepted: 61094 Total Submissions: 166767 Difficulty: Medium
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.

 */
public class GrayCode {

    public List<Integer> grayCode(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        if (n < 0) {
            return list;
        }

        if (n == 0) {
            list.add(0);
            return list;
        }

        if (n == 1) {
            list.add(0);
            list.add(1);
            return list;
        }

        List<Integer> code = grayCode(n - 1);

        int size = code.size();

        list.addAll(code);

        for (int i = size - 1; 0 <= i; i--) {
            list.add((1 << n - 1) + list.get(i));
        }

        return list;
    }
}
