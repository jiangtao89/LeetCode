package com.jt.leetcode.largestRectangleInHistogram;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by jiangtao on 16/5/29.
 * <p>
 * {@link "https://leetcode.com/problems/largest-rectangle-in-histogram/"}
 * <p>
 * 84. Largest Rectangle in Histogram My Submissions QuestionEditorial Solution
 * Total Accepted: 60553 Total Submissions: 248896 Difficulty: Hard
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 * <p>
 * <p>
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * <p>
 * <p>
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * <p>
 * For example,
 * Given heights = [2,1,5,6,2,3],
 * return 10.
 * <p>
 * Subscribe to see which companies asked this question
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        LinkedList<Integer> stack = new LinkedList<>();
        display(heights);
        int i = 0, res = 0;
        while (i < heights.length || !stack.isEmpty()) {
            if (i == heights.length || (!stack.isEmpty() && heights[stack.peek()] > heights[i])) {
                int h = heights[stack.pop()];
                int left = stack.isEmpty()? 0 : stack.peek() + 1;
                res = Math.max(res, h * (i - left));
            }
            else {
                stack.push(i++);
            }
            display(stack, res);
        }
        return res;
    }

    public void display(int[] heights) {
        StringBuilder builder = new StringBuilder();
        for (int value : heights) {
            builder.append(value);
            builder.append(',');
        }
        System.out.println(builder.toString());
    }

    public void display(LinkedList<Integer> stack, int res) {
        StringBuilder builder = new StringBuilder();
        builder.append("res = ");
        builder.append(res);
        builder.append('\n');
        for (Integer value : stack) {
            builder.append(value);
            builder.append(',');
        }
        System.out.println(builder.toString());
    }

//    public int largestRectangleArea(int[] heights) {
//
//        if (heights == null || heights.length == 0) {
//            return 0;
//        }
//
//        final int size = heights.length;
//
//        int result = 0;
//        int area = 0;
//        int max = 0;
//
//        for (int i = 1; i < Integer.MAX_VALUE; i++) {
//            area = 0;
//            max = 0;
//            for (int j = 0; j < size; j++) {
//                int height = heights[j];
//                if (i <= height) {
//                    area += i;
//                } else {
//                    if (max < area) {
//                        max = area;
//                    }
//                    area = 0;
//                }
//            }
//
//            if (max == 0) {
//                max = area;
//            }
//
//            if (max == 0) {
//                break;
//            }
//            if (result < max) {
//                result = max;
//            }
//        }
//
//        return result;
//    }
}
