package com.test.synchronize;

public class TestMain {
    public static void main(String[] args) {
        TestSynchronize testSynchronize = new TestSynchronize();
        new Thread(() -> testSynchronize.test1()).start();
        TestSynchronize testSynchronize1 = new TestSynchronize();
        new Thread(() -> testSynchronize.test2()).start();
    }
}
