package com.jt.leetcode.column;

/**
 * Created by jiangtao on 16/5/20.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class Column {

    public static final int MAX_COLUMN = 5;

    public int calculator(int total) {

        if (total <= 0) {
            return 1;
        }

        final int column = MAX_COLUMN;
        int row = total / column;

        if (total % column != 0) {
            row += 1;
        }

        for (int i = 1; i <= column; i++) {
            if (row * i >= total) {
                return i;
            }
        }

        return column;
    }
}
