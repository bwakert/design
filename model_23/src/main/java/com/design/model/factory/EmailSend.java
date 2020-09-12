package com.design.model.factory;

public class EmailSend implements Send {
    @Override
    public void getSend() {
        System.out.println("I am Email");
    }
}
