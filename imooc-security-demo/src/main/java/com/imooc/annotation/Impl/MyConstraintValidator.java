package com.imooc.annotation.Impl;

import com.imooc.annotation.MyConstraint;
import com.imooc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//因类中有autowire 但此处并不需要@Component  spring看到本类实现了ConstraintValidator接口，直接会纳管本类
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {
    @Autowired
    private HelloService helloService;

    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("my MyConstraintValidator init...");
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("______" + o);
        helloService.greeting("tom");
        return false;
    }
}
