package com.imooc.dto;

import com.imooc.annotation.MyConstraint;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.util.Date;

@Data
public class User {
    private Integer id;
    @MyConstraint(message = "11名字不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
    @Past
    private Date birthday;
}
