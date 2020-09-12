package com.design.model.factory;

public class QQFactory implements Provide {
    @Override
    public Send getSendFactory() {
        return new QQSend();
    }
}
