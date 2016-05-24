package com.jt.leetcode.mergeIntervals;

import sun.jvm.hotspot.utilities.Interval;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jiangtao on 16/5/24.
 * <p>
 * {@link "https://leetcode.com/problems/merge-intervals/"}
 * <p>
 * 56. Merge Intervals My Submissions QuestionEditorial Solution
 * Total Accepted: 68041 Total Submissions: 265768 Difficulty: Hard
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class MergeIntervals {


    public List<Interval> merge(List<Interval> intervals) {

        if (intervals == null) {
            return null;
        }

        if (intervals.size() <= 1) {
            return intervals;
        }

        int size = intervals.size();
        for (int i = 0; i < size - 1; i++) {

            Interval interval = intervals.get(0);

            boolean merge = false;

            int newSize = intervals.size();

            for (int j = 1; j < newSize; j++) {

                Interval tmp = intervals.get(j);
                if (!(interval.end < tmp.start
                        && tmp.end < interval.start)) {
                    break;
                }
            }

            if (merge) {
                intervals.remove(0);
            }
        }

        return intervals;
    }


    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

}


