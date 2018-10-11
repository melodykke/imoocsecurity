package com.imooc.security.core.properties.validate.code;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public interface ValidateCodeGenerator {

    ImageCode generate(HttpServletRequest request);

}
