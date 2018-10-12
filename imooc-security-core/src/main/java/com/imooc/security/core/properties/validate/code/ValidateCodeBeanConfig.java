package com.imooc.security.core.properties.validate.code;

import com.imooc.security.core.properties.SecurityProperties;
import com.imooc.security.core.properties.validate.code.image.ImageCodeGenerator;
import com.imooc.security.core.properties.validate.code.sms.DefaultSmsCodeSender;
import com.imooc.security.core.properties.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidateCodeBeanConfig {

    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    @ConditionalOnMissingBean(name = "imageCodeGenerator") // 如果在spring context中找得到名为imageCodeGenerator就不new bean 否则new
    public ValidateCodeGenerator imageCodeGenerator() {
        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
        codeGenerator.setSecurityProperties(securityProperties);
        return codeGenerator;
    }

    @Bean
    @ConditionalOnMissingBean(SmsCodeSender.class) // 如果在spring context中找得到SmsCodeSender.class接口的实现实例，就不new bean 否则new
    public SmsCodeSender smsCodeSender() {
        return new DefaultSmsCodeSender();
    }
}
