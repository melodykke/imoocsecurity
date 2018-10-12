package com.imooc.security.core.properties.validate.code.sms;

public interface SmsCodeSender {
    void send(String mobile, String code);
}
