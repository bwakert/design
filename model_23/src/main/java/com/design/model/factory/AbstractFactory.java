package com.design.model.factory;

public class AbstractFactory {
    public static void main(String[] args) {
        Provide provide = new EmailFactory();
        Send sendFactory = provide.getSendFactory();
        sendFactory.getSend();
        System.out.println("--------QQ-------");
        Provide qqProvide = new QQFactory();
        Send qqSender = qqProvide.getSendFactory();
        qqSender.getSend();
    }
}
