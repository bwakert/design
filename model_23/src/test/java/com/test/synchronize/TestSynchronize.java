package com.test.synchronize;

public class TestSynchronize {
    public void test1(){
        System.out.println("test1");
        synchronized (TestSynchronize.class){
            int i = 0;
            while (i<5){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(1000);
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void  test2(){
        System.out.println("test2");
        synchronized (TestSynchronize.class){
            int i = 0;
            while (i<5){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(1000);
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
