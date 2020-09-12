package com.design.model.factory;

public class EmailFactory implements Provide {
    @Override
    public Send getSendFactory() {
        return new EmailSend();
    }
}
