package com.dxs.springBoot.AOP.AopDemo.model;

import lombok.Data;

@Data
public class Message {
    String msgString;

    public Message(String msgString) {
        this.msgString = msgString;
    }

    public String getMsgString() {
        return msgString;
    }

    public void setMsgString(String msgString) {
        this.msgString = msgString;
    }
}
