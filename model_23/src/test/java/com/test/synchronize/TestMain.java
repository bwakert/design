package com.test.synchronize;

public class TestMain {
    public static void main(String[] args) {
        TestSynchronize testSynchronize = new TestSynchronize();

        new Thread(() -> testSynchronize.test1()).start();

        TestSynchronize testSynchronize12 = new TestSynchronize();

        new Thread(() -> testSynchronize.test2()).start();

        System.out.println(1234);
    }
}
