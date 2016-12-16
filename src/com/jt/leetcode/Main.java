package com.jt.leetcode;

import java.awt.event.ActionEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jiangtao on 16/5/19.
 *
 * @author jiang.tao
 * @version 1.0.0
 */
public class Main {

    public static void main(String args[]) {

        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }


        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        e.printStackTrace(); // 没有进入到这里
                    }
                });
                throw new IllegalArgumentException("test!!");
            }
        });
    }

    private void test() {
    }

    private void test(ActionEvent e) {}

}
