package com.imooc.code;

import com.imooc.security.core.properties.validate.code.ImageCode;
import com.imooc.security.core.properties.validate.code.ValidateCodeGenerator;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Component;

//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(HttpServletRequest request) {
        System.out.println("更高级的图形验证码申城代码");
        return null;
    }
}
