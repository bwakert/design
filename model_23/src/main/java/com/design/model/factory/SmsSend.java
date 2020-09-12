package com.design.model.factory;

public class SmsSend implements Send {
    @Override
    public void getSend() {
        System.out.println("I am sms");
    }
}
