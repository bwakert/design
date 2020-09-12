package com.design.model.factory;

public class SmsFactory implements Provide {
    @Override
    public Send getSendFactory() {
        return new SmsSend();
    }
}
