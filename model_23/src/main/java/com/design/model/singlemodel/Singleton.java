package com.design.model.singlemodel;

public class Singleton {

    //静态实例，防止被引用
    private static Singleton instance = null;

    //构造方法私有化，防止被实例化
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (instance){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
